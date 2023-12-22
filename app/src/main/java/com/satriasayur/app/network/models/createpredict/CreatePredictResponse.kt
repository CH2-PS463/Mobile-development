package com.satriasayur.app.network.models.createpredict

import com.google.gson.annotations.SerializedName

data class CreatePredictResponse(

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("status")
	val status: String? = null
)
