package com.satriasayur.app.network

import com.satriasayur.app.network.models.createlogin.CreateLoginRequest
import com.satriasayur.app.network.models.createlogin.CreateLoginResponse
import com.satriasayur.app.network.models.createpredict.CreatePredictRequest
import com.satriasayur.app.network.models.createpredict.CreatePredictResponse
import kotlin.String
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface RetrofitServices {
  @POST("/predict")
  suspend fun createPredict(@Body createPredictRequest: CreatePredictRequest?):
      CreatePredictResponse

  @POST("/auth/login")
  suspend fun createLogin(@Header("Content-Type") contentType: String?, @Body
      createLoginRequest: CreateLoginRequest?): CreateLoginResponse
}

const val BASE_URL: String = "https://backend-xq4njtznoq-uc.a.run.app"
