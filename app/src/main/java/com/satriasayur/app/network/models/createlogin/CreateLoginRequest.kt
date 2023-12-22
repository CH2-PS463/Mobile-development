package com.satriasayur.app.network.models.createlogin

import com.google.gson.annotations.SerializedName

data class CreateLoginRequest(

	@field:SerializedName("password")
	val password: String? = null,

	@field:SerializedName("email")
	val email: String? = null
)
