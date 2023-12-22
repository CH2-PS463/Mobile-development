package com.satriasayur.app.modules.hasilperiksasementara.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.satriasayur.app.modules.hasilperiksasementara.`data`.model.HasilPeriksaSementaraModel
import org.koin.core.KoinComponent

class HasilPeriksaSementaraVM : ViewModel(), KoinComponent {
  val hasilPeriksaSementaraModel: MutableLiveData<HasilPeriksaSementaraModel> =
      MutableLiveData(HasilPeriksaSementaraModel())

  var navArguments: Bundle? = null
}
