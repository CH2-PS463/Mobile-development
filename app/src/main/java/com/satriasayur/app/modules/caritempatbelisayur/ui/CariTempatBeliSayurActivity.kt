package com.satriasayur.app.modules.caritempatbelisayur.ui

import androidx.activity.viewModels
import com.satriasayur.app.R
import com.satriasayur.app.appcomponents.base.BaseActivity
import com.satriasayur.app.databinding.ActivityCariTempatBeliSayurBinding
import com.satriasayur.app.modules.caritempatbelisayur.`data`.model.SpinnerGroupNinetySevenModel
import com.satriasayur.app.modules.caritempatbelisayur.`data`.viewmodel.CariTempatBeliSayurVM
import kotlin.String
import kotlin.Unit

class CariTempatBeliSayurActivity :
    BaseActivity<ActivityCariTempatBeliSayurBinding>(R.layout.activity_cari_tempat_beli_sayur) {
  private val viewModel: CariTempatBeliSayurVM by viewModels<CariTempatBeliSayurVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroupNinetySevenList.value = mutableListOf(
    SpinnerGroupNinetySevenModel("Item1"),
    SpinnerGroupNinetySevenModel("Item2"),
    SpinnerGroupNinetySevenModel("Item3"),
    SpinnerGroupNinetySevenModel("Item4"),
    SpinnerGroupNinetySevenModel("Item5")
    )
    val spinnerGroupNinetySevenAdapter =
    SpinnerGroupNinetySevenAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupNinetySevenList.value?:
    mutableListOf())
    binding.spinnerGroupNinetySeven.adapter = spinnerGroupNinetySevenAdapter
    binding.cariTempatBeliSayurVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CARI_TEMPAT_BELI_SAYUR_ACTIVITY"

  }
}
