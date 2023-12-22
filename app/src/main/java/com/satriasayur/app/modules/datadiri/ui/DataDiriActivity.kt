package com.satriasayur.app.modules.datadiri.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.satriasayur.app.R
import com.satriasayur.app.appcomponents.base.BaseActivity
import com.satriasayur.app.databinding.ActivityDataDiriBinding
import com.satriasayur.app.modules.datadiri.`data`.model.DataDiriRowModel
import com.satriasayur.app.modules.datadiri.`data`.model.SpinnerGroup114Model
import com.satriasayur.app.modules.datadiri.`data`.model.SpinnerGroup116Model
import com.satriasayur.app.modules.datadiri.`data`.viewmodel.DataDiriVM
import com.satriasayur.app.modules.hasilperiksasementara.ui.HasilPeriksaSementaraActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DataDiriActivity : BaseActivity<ActivityDataDiriBinding>(R.layout.activity_data_diri) {
  private val viewModel: DataDiriVM by viewModels<DataDiriVM>()

  private val REQUEST_CODE_HASIL_PERIKSA_SEMENTARA_ACTIVITY: Int = 388

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroup116List.value = mutableListOf(
    SpinnerGroup116Model("Item1"),
    SpinnerGroup116Model("Item2"),
    SpinnerGroup116Model("Item3"),
    SpinnerGroup116Model("Item4"),
    SpinnerGroup116Model("Item5")
    )
    val spinnerGroup116Adapter =
    SpinnerGroup116Adapter(this,R.layout.spinner_item,viewModel.spinnerGroup116List.value?:
    mutableListOf())
    binding.spinnerGroup116.adapter = spinnerGroup116Adapter
    viewModel.spinnerGroup114List.value = mutableListOf(
    SpinnerGroup114Model("Item1"),
    SpinnerGroup114Model("Item2"),
    SpinnerGroup114Model("Item3"),
    SpinnerGroup114Model("Item4"),
    SpinnerGroup114Model("Item5")
    )
    val spinnerGroup114Adapter =
    SpinnerGroup114Adapter(this,R.layout.spinner_item,viewModel.spinnerGroup114List.value?:
    mutableListOf())
    binding.spinnerGroup114.adapter = spinnerGroup114Adapter
    val dataDiriAdapter = DataDiriAdapter(viewModel.dataDiriList.value?:mutableListOf())
    binding.recyclerDataDiri.adapter = dataDiriAdapter
    dataDiriAdapter.setOnItemClickListener(
    object : DataDiriAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DataDiriRowModel) {
        onClickRecyclerDataDiri(view, position, item)
      }
    }
    )
    viewModel.dataDiriList.observe(this) {
      dataDiriAdapter.updateData(it)
    }
    binding.dataDiriVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnLihatHasilPeriksaSementara.setOnClickListener {
      val destIntent = HasilPeriksaSementaraActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HASIL_PERIKSA_SEMENTARA_ACTIVITY)
    }
  }

  fun onClickRecyclerDataDiri(
    view: View,
    position: Int,
    item: DataDiriRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DATA_DIRI_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DataDiriActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
