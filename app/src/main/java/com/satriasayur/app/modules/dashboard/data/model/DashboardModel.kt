package com.satriasayur.app.modules.dashboard.`data`.model

import com.satriasayur.app.R
import com.satriasayur.app.appcomponents.di.MyApp
import kotlin.String

data class DashboardModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSatriaSayur: String? = MyApp.getInstance().resources.getString(R.string.lbl_satriasayur)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHaloTestUserOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_halo_testuser1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTopMeals: String? = MyApp.getInstance().resources.getString(R.string.lbl_top_meals)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeteksiCari: String? = MyApp.getInstance().resources.getString(R.string.msg_deteksi_cari)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScanSayuran: String? = MyApp.getInstance().resources.getString(R.string.lbl_scan_sayuran)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDietPlan: String? = MyApp.getInstance().resources.getString(R.string.lbl_diet_plan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProgresSaya: String? = MyApp.getInstance().resources.getString(R.string.lbl_progres_saya)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCariSayur: String? = MyApp.getInstance().resources.getString(R.string.lbl_cari_sayur)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStatistik: String? = MyApp.getInstance().resources.getString(R.string.lbl_statistik)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMaafbelumada: String? =
      MyApp.getInstance().resources.getString(R.string.msg_maaf_belum_ada)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMulaiscansayu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_mulai_scan_sayu)
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
