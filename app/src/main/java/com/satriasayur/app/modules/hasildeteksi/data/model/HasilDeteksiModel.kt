package com.satriasayur.app.modules.hasildeteksi.`data`.model

import com.satriasayur.app.R
import com.satriasayur.app.appcomponents.di.MyApp
import kotlin.String

data class HasilDeteksiModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSatriaSayur: String? = MyApp.getInstance().resources.getString(R.string.lbl_satriasayur)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHasilDeteksi: String? = MyApp.getInstance().resources.getString(R.string.lbl_hasil_deteksi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIuCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_6300_iu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeight: String? = MyApp.getInstance().resources.getString(R.string.lbl_55_mg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeightOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_113_mg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKangkung: String? = MyApp.getInstance().resources.getString(R.string.lbl_kangkung)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLemak: String? = MyApp.getInstance().resources.getString(R.string.lbl_lemak)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeightFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_0_20_g)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKolesterol: String? = MyApp.getInstance().resources.getString(R.string.lbl_kolesterol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeightFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_0_0_mg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtResepresepYan: String? =
      MyApp.getInstance().resources.getString(R.string.msg_resep_resep_yan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCariDimanaBel: String? =
      MyApp.getInstance().resources.getString(R.string.msg_cari_dimana_bel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBuatDietPlan: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_buat_diet_plan)
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
