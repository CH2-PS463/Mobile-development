package com.satriasayur.app.modules.dashboard.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.satriasayur.app.modules.dashboard.`data`.model.DashboardModel
import com.satriasayur.app.modules.dashboard.`data`.model.ListcapaiankaloriRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DashboardVM : ViewModel(), KoinComponent {
  val dashboardModel: MutableLiveData<DashboardModel> = MutableLiveData(DashboardModel())

  var navArguments: Bundle? = null

  val listcapaiankaloriList: MutableLiveData<MutableList<ListcapaiankaloriRowModel>> =
      MutableLiveData(mutableListOf())
}
