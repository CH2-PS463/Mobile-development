package com.satriasayur.app.modules.spalshscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.satriasayur.app.modules.spalshscreen.`data`.model.SpalshscreenModel
import org.koin.core.KoinComponent

class SpalshscreenVM : ViewModel(), KoinComponent {
  val spalshscreenModel: MutableLiveData<SpalshscreenModel> = MutableLiveData(SpalshscreenModel())

  var navArguments: Bundle? = null
}
