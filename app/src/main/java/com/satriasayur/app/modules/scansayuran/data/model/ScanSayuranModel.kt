package com.satriasayur.app.modules.scansayuran.`data`.model

import com.satriasayur.app.R
import com.satriasayur.app.appcomponents.di.MyApp
import kotlin.String

data class ScanSayuranModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSatriaSayur: String? = MyApp.getInstance().resources.getString(R.string.lbl_satriasayur)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScanSayuran: String? = MyApp.getInstance().resources.getString(R.string.lbl_scan_sayuran)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGunakanfiturs: String? =
      MyApp.getInstance().resources.getString(R.string.msg_gunakan_fitur_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScanDariKamer: String? =
      MyApp.getInstance().resources.getString(R.string.msg_scan_dari_kamer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUploadDariGal: String? =
      MyApp.getInstance().resources.getString(R.string.msg_upload_dari_gal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHasilGambar: String? = MyApp.getInstance().resources.getString(R.string.lbl_hasil_gambar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeteksiGambar: String? =
      MyApp.getInstance().resources.getString(R.string.msg_deteksi_gambar)
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
