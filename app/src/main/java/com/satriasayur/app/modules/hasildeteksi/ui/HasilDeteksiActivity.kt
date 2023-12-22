package com.satriasayur.app.modules.hasildeteksi.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.satriasayur.app.R
import com.satriasayur.app.appcomponents.base.BaseActivity
import com.satriasayur.app.databinding.ActivityHasilDeteksiBinding
import com.satriasayur.app.modules.hasildeteksi.`data`.model.ListkaloriRowModel
import com.satriasayur.app.modules.hasildeteksi.`data`.model.ListrectangletwentynineRowModel
import com.satriasayur.app.modules.hasildeteksi.`data`.viewmodel.HasilDeteksiVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HasilDeteksiActivity :
    BaseActivity<ActivityHasilDeteksiBinding>(R.layout.activity_hasil_deteksi) {
  private val viewModel: HasilDeteksiVM by viewModels<HasilDeteksiVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listkaloriAdapter = ListkaloriAdapter(viewModel.listkaloriList.value?:mutableListOf())
    binding.recyclerListkalori.adapter = listkaloriAdapter
    listkaloriAdapter.setOnItemClickListener(
    object : ListkaloriAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListkaloriRowModel) {
        onClickRecyclerListkalori(view, position, item)
      }
    }
    )
    viewModel.listkaloriList.observe(this) {
      listkaloriAdapter.updateData(it)
    }
    val listrectangletwentynineAdapter =
    ListrectangletwentynineAdapter(viewModel.listrectangletwentynineList.value?:mutableListOf())
    binding.recyclerListrectangletwentynine.adapter = listrectangletwentynineAdapter
    listrectangletwentynineAdapter.setOnItemClickListener(
    object : ListrectangletwentynineAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListrectangletwentynineRowModel) {
        onClickRecyclerListrectangletwentynine(view, position, item)
      }
    }
    )
    viewModel.listrectangletwentynineList.observe(this) {
      listrectangletwentynineAdapter.updateData(it)
    }
    binding.hasilDeteksiVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListkalori(
    view: View,
    position: Int,
    item: ListkaloriRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListrectangletwentynine(
    view: View,
    position: Int,
    item: ListrectangletwentynineRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HASIL_DETEKSI_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HasilDeteksiActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
