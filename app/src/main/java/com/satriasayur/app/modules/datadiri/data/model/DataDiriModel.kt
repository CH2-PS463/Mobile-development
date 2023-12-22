package com.satriasayur.app.modules.datadiri.`data`.model

import com.satriasayur.app.R
import com.satriasayur.app.appcomponents.di.MyApp
import kotlin.String

data class DataDiriModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSatriaSayur: String? = MyApp.getInstance().resources.getString(R.string.lbl_satriasayur)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIsiDataDiriK: String? =
      MyApp.getInstance().resources.getString(R.string.msg_isi_data_diri_k)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKamibutuhdata: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kami_butuh_data)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNamaLengkap: String? = MyApp.getInstance().resources.getString(R.string.lbl_nama_lengkap)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTanggalLahir: String? = MyApp.getInstance().resources.getString(R.string.lbl_tanggal_lahir)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJenisKelamin: String? = MyApp.getInstance().resources.getString(R.string.lbl_jenis_kelamin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTujuanDietKes: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tujuan_diet_kes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup113Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup115Value: String? = null
)
