package com.satriasayur.app.modules.caritempatbelisayur.`data`.model

import com.satriasayur.app.R
import com.satriasayur.app.appcomponents.di.MyApp
import kotlin.String

data class CariTempatBeliSayurModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSatriaSayur: String? = MyApp.getInstance().resources.getString(R.string.lbl_satriasayur)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDietPlan: String? = MyApp.getInstance().resources.getString(R.string.lbl_diet_plan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTujuanDietPla: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tujuan_diet_pla)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAsesmenDiri: String? = MyApp.getInstance().resources.getString(R.string.lbl_asesmen_diri)
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
  var txtRekomendasiDie: String? =
      MyApp.getInstance().resources.getString(R.string.msg_rekomendasi_die)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMenaikkanBerat: String? =
      MyApp.getInstance().resources.getString(R.string.msg_menaikkan_berat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInihanyarek: String? = MyApp.getInstance().resources.getString(R.string.msg_ini_hanya_rek)
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
