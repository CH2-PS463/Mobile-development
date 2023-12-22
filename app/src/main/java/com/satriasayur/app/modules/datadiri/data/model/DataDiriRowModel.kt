package com.satriasayur.app.modules.datadiri.`data`.model

import com.satriasayur.app.R
import com.satriasayur.app.appcomponents.di.MyApp
import kotlin.String

data class DataDiriRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBeratBadan: String? = MyApp.getInstance().resources.getString(R.string.lbl_berat_badan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEightyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_85)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKg: String? = MyApp.getInstance().resources.getString(R.string.lbl_kg)

)
