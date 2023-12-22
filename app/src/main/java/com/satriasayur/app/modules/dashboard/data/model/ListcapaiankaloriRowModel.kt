package com.satriasayur.app.modules.dashboard.`data`.model

import com.satriasayur.app.R
import com.satriasayur.app.appcomponents.di.MyApp
import kotlin.String

data class ListcapaiankaloriRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCapaianKalori: String? =
      MyApp.getInstance().resources.getString(R.string.msg_capaian_kalori)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt02200kkal: String? = MyApp.getInstance().resources.getString(R.string.lbl_0_2200_kkal)

)
