package com.satriasayur.app.modules.hasilperiksasementara.`data`.model

import com.satriasayur.app.R
import com.satriasayur.app.appcomponents.di.MyApp
import kotlin.String

data class HasilPeriksaSementaraModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSatriaSayur: String? = MyApp.getInstance().resources.getString(R.string.lbl_satriasayur)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHasilPeriksaS: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hasil_periksa_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBerikutinimer: String? =
      MyApp.getInstance().resources.getString(R.string.msg_berikut_ini_mer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBeratBadan: String? = MyApp.getInstance().resources.getString(R.string.lbl_berat_badan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeight: String? = MyApp.getInstance().resources.getString(R.string.lbl_60_kg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTinggiBadan: String? = MyApp.getInstance().resources.getString(R.string.lbl_tinggi_badan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistance: String? = MyApp.getInstance().resources.getString(R.string.lbl_180_cm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIndexBMI: String? = MyApp.getInstance().resources.getString(R.string.lbl_index_bmi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundredNinety: String? = MyApp.getInstance().resources.getString(R.string.lbl_19_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_rumus_bmi_ber)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTujuanDiet: String? = MyApp.getInstance().resources.getString(R.string.lbl_tujuan_diet)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMenurukanBerat: String? =
      MyApp.getInstance().resources.getString(R.string.msg_menurukan_berat)

)
