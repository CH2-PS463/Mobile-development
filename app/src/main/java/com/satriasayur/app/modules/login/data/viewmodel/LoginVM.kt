package com.satriasayur.app.modules.login.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.satriasayur.app.appcomponents.utility.PreferenceHelper
import com.satriasayur.app.modules.login.`data`.model.LoginModel
import com.satriasayur.app.network.models.createlogin.CreateLoginRequest
import com.satriasayur.app.network.models.createlogin.CreateLoginResponse
import com.satriasayur.app.network.repository.NetworkRepository
import com.satriasayur.app.network.resources.Response
import kotlin.Boolean
import kotlin.Unit
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent
import org.koin.core.inject

class LoginVM : ViewModel(), KoinComponent {
  val loginModel: MutableLiveData<LoginModel> = MutableLiveData(LoginModel())


  var navArguments: Bundle? = null


  val progressLiveData: MutableLiveData<Boolean> = MutableLiveData<Boolean>()


  private val networkRepository: NetworkRepository by inject()

  val createLoginLiveData: MutableLiveData<Response<CreateLoginResponse>> =
      MutableLiveData<Response<CreateLoginResponse>>()


  private val prefs: PreferenceHelper by inject()

  lateinit var googleAuthResponse: GoogleSignInAccount

  fun callCreateLoginApi(): Unit {
    viewModelScope.launch {
      progressLiveData.postValue(true)
      createLoginLiveData.postValue(
      networkRepository.createLogin(
      contentType = """application/json""",
      createLoginRequest = CreateLoginRequest()
      )
      )
      progressLiveData.postValue(false)
    }
  }

  fun bindCreateLoginResponse(response: CreateLoginResponse): Unit {
    val loginModelValue = loginModel.value ?:LoginModel()
    prefs.setAccesToken(response.accessToken)
    loginModel.value = loginModelValue
  }
}
