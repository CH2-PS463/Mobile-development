package com.satriasayur.app.modules.caritempatbelisayurone.ui

import android.view.View
import androidx.activity.viewModels
import com.satriasayur.app.R
import com.satriasayur.app.appcomponents.base.BaseActivity
import com.satriasayur.app.databinding.ActivityCariTempatBeliSayurOneBinding
import com.satriasayur.app.modules.caritempatbelisayurone.`data`.model.Listrectangletwentynine1RowModel
import com.satriasayur.app.modules.caritempatbelisayurone.`data`.viewmodel.CariTempatBeliSayurOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CariTempatBeliSayurOneActivity :
    BaseActivity<ActivityCariTempatBeliSayurOneBinding>(R.layout.activity_cari_tempat_beli_sayur_one)
    {
  private val viewModel: CariTempatBeliSayurOneVM by viewModels<CariTempatBeliSayurOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectangletwentynineAdapter =
    ListrectangletwentynineAdapter(viewModel.listrectangletwentynineList.value?:mutableListOf())
    binding.recyclerListrectangletwentynine.adapter = listrectangletwentynineAdapter
    listrectangletwentynineAdapter.setOnItemClickListener(
    object : ListrectangletwentynineAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      Listrectangletwentynine1RowModel) {
        onClickRecyclerListrectangletwentynine(view, position, item)
      }
    }
    )
    viewModel.listrectangletwentynineList.observe(this) {
      listrectangletwentynineAdapter.updateData(it)
    }
    binding.cariTempatBeliSayurOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListrectangletwentynine(
    view: View,
    position: Int,
    item: Listrectangletwentynine1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CARI_TEMPAT_BELI_SAYUR_ONE_ACTIVITY"

  }
}
