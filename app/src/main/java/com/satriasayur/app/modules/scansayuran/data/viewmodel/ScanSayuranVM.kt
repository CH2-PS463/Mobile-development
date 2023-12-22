package com.satriasayur.app.modules.scansayuran.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.satriasayur.app.appcomponents.utility.PreferenceHelper
import com.satriasayur.app.modules.scansayuran.`data`.model.ScanSayuranModel
import com.satriasayur.app.network.models.createpredict.CreatePredictRequest
import com.satriasayur.app.network.models.createpredict.CreatePredictResponse
import com.satriasayur.app.network.repository.NetworkRepository
import com.satriasayur.app.network.resources.Response
import kotlin.Boolean
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent
import org.koin.core.inject

class ScanSayuranVM : ViewModel(), KoinComponent {
  val scanSayuranModel: MutableLiveData<ScanSayuranModel> = MutableLiveData(ScanSayuranModel())


  var navArguments: Bundle? = null


  val progressLiveData: MutableLiveData<Boolean> = MutableLiveData<Boolean>()

  private val networkRepository: NetworkRepository by inject()

  val createPredictLiveData: MutableLiveData<Response<CreatePredictResponse>> =
      MutableLiveData<Response<CreatePredictResponse>>()

  private val prefs: PreferenceHelper by inject()

  fun callCreatePredictApi() {
    viewModelScope.launch {
      progressLiveData.postValue(true)
      createPredictLiveData.postValue(
      networkRepository.createPredict(
      createPredictRequest = CreatePredictRequest()
      )
      )
      progressLiveData.postValue(false)
    }
  }

  fun bindCreatePredictResponse(response: CreatePredictResponse) {
    val scanSayuranModelValue = scanSayuranModel.value ?:ScanSayuranModel()
    prefs.setStatus(response.status)
    prefs.setMessage(response.message)
    scanSayuranModel.value = scanSayuranModelValue
  }
}
