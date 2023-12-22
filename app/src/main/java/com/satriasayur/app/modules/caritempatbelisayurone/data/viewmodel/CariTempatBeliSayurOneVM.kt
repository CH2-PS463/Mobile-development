package com.satriasayur.app.modules.caritempatbelisayurone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.satriasayur.app.modules.caritempatbelisayurone.`data`.model.CariTempatBeliSayurOneModel
import com.satriasayur.app.modules.caritempatbelisayurone.`data`.model.Listrectangletwentynine1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CariTempatBeliSayurOneVM : ViewModel(), KoinComponent {
  val cariTempatBeliSayurOneModel: MutableLiveData<CariTempatBeliSayurOneModel> =
      MutableLiveData(CariTempatBeliSayurOneModel())

  var navArguments: Bundle? = null

  val listrectangletwentynineList: MutableLiveData<MutableList<Listrectangletwentynine1RowModel>> =
      MutableLiveData(mutableListOf())
}
