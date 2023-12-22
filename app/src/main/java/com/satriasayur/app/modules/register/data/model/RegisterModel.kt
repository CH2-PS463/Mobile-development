package com.satriasayur.app.modules.register.`data`.model

import com.satriasayur.app.R
import com.satriasayur.app.appcomponents.di.MyApp
import kotlin.String

data class RegisterModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSatriaSayur: String? = MyApp.getInstance().resources.getString(R.string.lbl_satriasayur)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDaftarkanDiri: String? =
      MyApp.getInstance().resources.getString(R.string.msg_daftarkan_diri)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAyomulaiperja: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ayo_mulai_perja)
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
  var txtKonfirmasiKata: String? =
      MyApp.getInstance().resources.getString(R.string.msg_konfirmasi_kata)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAtau: String? = MyApp.getInstance().resources.getString(R.string.lbl_atau)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDaftardenganG: String? =
      MyApp.getInstance().resources.getString(R.string.msg_daftar_dengan_g)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSudahpunyaaku: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sudah_punya_aku)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup107Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup108Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup109Value: String? = null
)
