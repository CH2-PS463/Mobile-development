package com.satriasayur.app.modules.hasildeteksi.`data`.model

import com.satriasayur.app.R
import com.satriasayur.app.appcomponents.di.MyApp
import kotlin.String

data class ListkaloriRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKalori: String? = MyApp.getInstance().resources.getString(R.string.lbl_kalori)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKcalCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_19_kcal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVitaminA: String? = MyApp.getInstance().resources.getString(R.string.lbl_vitamin_a)

)
