package com.satriasayur.app.modules.dashboard.`data`.model

import com.satriasayur.app.R
import com.satriasayur.app.appcomponents.di.MyApp
import kotlin.String

data class ImageSliderSliderrectangletwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCahKangkung: String? = MyApp.getInstance().resources.getString(R.string.lbl_cah_kangkung)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var imageRectangleTwo: String? = ""

)
