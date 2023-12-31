package com.satriasayur.app.network.repository

import com.satriasayur.app.R
import com.satriasayur.app.appcomponents.di.MyApp
import com.satriasayur.app.extensions.NoInternetConnection
import com.satriasayur.app.extensions.isOnline
import com.satriasayur.app.network.RetrofitServices
import com.satriasayur.app.network.models.createlogin.CreateLoginRequest
import com.satriasayur.app.network.models.createlogin.CreateLoginResponse
import com.satriasayur.app.network.models.createpredict.CreatePredictRequest
import com.satriasayur.app.network.models.createpredict.CreatePredictResponse
import com.satriasayur.app.network.resources.ErrorResponse
import com.satriasayur.app.network.resources.Response
import com.satriasayur.app.network.resources.SuccessResponse
import java.lang.Exception
import kotlin.String
import org.koin.core.KoinComponent
import org.koin.core.inject

class NetworkRepository : KoinComponent {
  private val retrofitServices: RetrofitServices by inject()

  private val errorMessage: String = "Something went wrong."

  suspend fun createPredict(createPredictRequest: CreatePredictRequest?):
      Response<CreatePredictResponse> = try {
    val isOnline = MyApp.getInstance().isOnline()
    if(isOnline) {
      SuccessResponse(retrofitServices.createPredict(createPredictRequest))
    } else {
      val internetException =
          NoInternetConnection(MyApp.getInstance().getString(R.string.no_internet_connection))
      ErrorResponse(internetException.message ?:errorMessage, internetException)
    }
  } catch(e:Exception) {
    e.printStackTrace()
    ErrorResponse(e.message ?:errorMessage, e)
  }

  suspend fun createLogin(contentType: String?, createLoginRequest: CreateLoginRequest?):
      Response<CreateLoginResponse> = try {
    val isOnline = MyApp.getInstance().isOnline()
    if(isOnline) {
      SuccessResponse(retrofitServices.createLogin(contentType, createLoginRequest))
    } else {
      val internetException =
          NoInternetConnection(MyApp.getInstance().getString(R.string.no_internet_connection))
      ErrorResponse(internetException.message ?:errorMessage, internetException)
    }
  } catch(e:Exception) {
    e.printStackTrace()
    ErrorResponse(e.message ?:errorMessage, e)
  }
}
