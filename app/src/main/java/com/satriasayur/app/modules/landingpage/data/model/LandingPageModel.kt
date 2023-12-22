package com.satriasayur.app.modules.landingpage.`data`.model

import com.satriasayur.app.R
import com.satriasayur.app.appcomponents.di.MyApp
import kotlin.String

data class LandingPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSelamatDatang: String? =
      MyApp.getInstance().resources.getString(R.string.msg_selamat_datang)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSatriaSayur: String? = MyApp.getInstance().resources.getString(R.string.lbl_satriasayur)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBantumembawamu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_bantu_membawamu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup102: String? = MyApp.getInstance().resources.getString(R.string.msg_langkah_1_det)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup101: String? = MyApp.getInstance().resources.getString(R.string.msg_langkah_2_lih)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup100: String? = MyApp.getInstance().resources.getString(R.string.msg_langkah_3_bik)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentyOneValue: String? = null
)
