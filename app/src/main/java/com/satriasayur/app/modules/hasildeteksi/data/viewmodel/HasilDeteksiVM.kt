package com.satriasayur.app.modules.hasildeteksi.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.satriasayur.app.modules.hasildeteksi.`data`.model.HasilDeteksiModel
import com.satriasayur.app.modules.hasildeteksi.`data`.model.ListkaloriRowModel
import com.satriasayur.app.modules.hasildeteksi.`data`.model.ListrectangletwentynineRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HasilDeteksiVM : ViewModel(), KoinComponent {
  val hasilDeteksiModel: MutableLiveData<HasilDeteksiModel> = MutableLiveData(HasilDeteksiModel())

  var navArguments: Bundle? = null

  val listkaloriList: MutableLiveData<MutableList<ListkaloriRowModel>> =
      MutableLiveData(mutableListOf())

  val listrectangletwentynineList: MutableLiveData<MutableList<ListrectangletwentynineRowModel>> =
      MutableLiveData(mutableListOf())
}
