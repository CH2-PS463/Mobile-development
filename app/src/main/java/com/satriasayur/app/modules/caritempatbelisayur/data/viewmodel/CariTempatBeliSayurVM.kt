package com.satriasayur.app.modules.caritempatbelisayur.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.satriasayur.app.modules.caritempatbelisayur.`data`.model.CariTempatBeliSayurModel
import com.satriasayur.app.modules.caritempatbelisayur.`data`.model.SpinnerGroupNinetySevenModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CariTempatBeliSayurVM : ViewModel(), KoinComponent {
  val cariTempatBeliSayurModel: MutableLiveData<CariTempatBeliSayurModel> =
      MutableLiveData(CariTempatBeliSayurModel())

  var navArguments: Bundle? = null

  val spinnerGroupNinetySevenList: MutableLiveData<MutableList<SpinnerGroupNinetySevenModel>> =
      MutableLiveData()
}
