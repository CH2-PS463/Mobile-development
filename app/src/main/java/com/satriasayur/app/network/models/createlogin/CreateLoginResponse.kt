package com.satriasayur.app.network.models.createlogin

import com.google.gson.annotations.SerializedName

data class CreateLoginResponse(

	@field:SerializedName("accessToken")
	val accessToken: String? = null
)
