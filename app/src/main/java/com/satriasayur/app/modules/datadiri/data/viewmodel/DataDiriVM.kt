package com.satriasayur.app.modules.datadiri.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.satriasayur.app.modules.datadiri.`data`.model.DataDiriModel
import com.satriasayur.app.modules.datadiri.`data`.model.DataDiriRowModel
import com.satriasayur.app.modules.datadiri.`data`.model.SpinnerGroup114Model
import com.satriasayur.app.modules.datadiri.`data`.model.SpinnerGroup116Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DataDiriVM : ViewModel(), KoinComponent {
  val dataDiriModel: MutableLiveData<DataDiriModel> = MutableLiveData(DataDiriModel())

  var navArguments: Bundle? = null

  val spinnerGroup116List: MutableLiveData<MutableList<SpinnerGroup116Model>> = MutableLiveData()

  val spinnerGroup114List: MutableLiveData<MutableList<SpinnerGroup114Model>> = MutableLiveData()

  val dataDiriList: MutableLiveData<MutableList<DataDiriRowModel>> =
      MutableLiveData(mutableListOf())
}
