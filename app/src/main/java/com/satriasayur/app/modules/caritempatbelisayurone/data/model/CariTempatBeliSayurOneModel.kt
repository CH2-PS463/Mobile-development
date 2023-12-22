package com.satriasayur.app.modules.caritempatbelisayurone.`data`.model

import com.satriasayur.app.R
import com.satriasayur.app.appcomponents.di.MyApp
import kotlin.String

data class CariTempatBeliSayurOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSatriaSayur: String? = MyApp.getInstance().resources.getString(R.string.lbl_satriasayur)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTempatBeliSay: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tempat_beli_say)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKangkung: String? = MyApp.getInstance().resources.getString(R.string.lbl_kangkung)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDashboard: String? = MyApp.getInstance().resources.getString(R.string.lbl_dashboard)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAkunSaya: String? = MyApp.getInstance().resources.getString(R.string.lbl_akun_saya)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPengaturan: String? = MyApp.getInstance().resources.getString(R.string.lbl_pengaturan)

)
