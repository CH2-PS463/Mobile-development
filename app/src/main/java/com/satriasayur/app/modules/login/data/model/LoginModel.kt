package com.satriasayur.app.modules.login.`data`.model

import com.satriasayur.app.R
import com.satriasayur.app.appcomponents.di.MyApp
import kotlin.String

data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSatriaSayur: String? = MyApp.getInstance().resources.getString(R.string.lbl_satriasayur)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelamatDatang: String? =
      MyApp.getInstance().resources.getString(R.string.msg_selamat_datang2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_selamat_datang3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKataSandi: String? = MyApp.getInstance().resources.getString(R.string.lbl_kata_sandi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLupaKataSandi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lupa_kata_sandi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAtau: String? = MyApp.getInstance().resources.getString(R.string.lbl_atau)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMasukdenganGo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_masuk_dengan_go)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBelumpunyaaku: String? =
      MyApp.getInstance().resources.getString(R.string.msg_belum_punya_aku)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup122Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup123Value: String? = null
)
