package com.satriasayur.app.modules.dashboard.ui

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.satriasayur.app.R
import com.satriasayur.app.appcomponents.base.BaseActivity
import com.satriasayur.app.databinding.ActivityDashboardBinding
import com.satriasayur.app.modules.dashboard.`data`.model.ImageSliderSliderrectangletwoModel
import com.satriasayur.app.modules.dashboard.`data`.model.ListcapaiankaloriRowModel
import com.satriasayur.app.modules.dashboard.`data`.viewmodel.DashboardVM
import com.satriasayur.app.modules.datadiri.ui.DataDiriActivity
import com.satriasayur.app.modules.login.ui.LoginActivity
import com.satriasayur.app.modules.scansayuran.ui.ScanSayuranActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class DashboardActivity : BaseActivity<ActivityDashboardBinding>(R.layout.activity_dashboard) {
  private val imageUri: Uri =
      Uri.parse("android.resource://com.satriasayur.app/drawable/img_rectangle2")


  private val imageSliderSliderrectangletwoItems: ArrayList<ImageSliderSliderrectangletwoModel> =
      arrayListOf(ImageSliderSliderrectangletwoModel(imageRectangleTwo =
  imageUri.toString()),ImageSliderSliderrectangletwoModel(imageRectangleTwo =
  imageUri.toString()))


  private val viewModel: DashboardVM by viewModels<DashboardVM>()

  private val REQUEST_CODE_DATA_DIRI_ACTIVITY: Int = 740


  private val REQUEST_CODE_SCAN_SAYURAN_ACTIVITY: Int = 861


  private val REQUEST_CODE_LOGIN_ACTIVITY: Int = 533


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val sliderrectangletwoAdapter =
    SliderrectangletwoAdapter(imageSliderSliderrectangletwoItems,true)
    binding.imageSliderSliderrectangletwo.adapter = sliderrectangletwoAdapter
    binding.imageSliderSliderrectangletwo.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorGroupOne.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorGroupOne.updateIndicatorCounts(binding.imageSliderSliderrectangletwo.indicatorCount)
    val listcapaiankaloriAdapter =
    ListcapaiankaloriAdapter(viewModel.listcapaiankaloriList.value?:mutableListOf())
    binding.recyclerListcapaiankalori.adapter = listcapaiankaloriAdapter
    listcapaiankaloriAdapter.setOnItemClickListener(
    object : ListcapaiankaloriAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListcapaiankaloriRowModel) {
        onClickRecyclerListcapaiankalori(view, position, item)
      }
    }
    )
    viewModel.listcapaiankaloriList.observe(this) {
      listcapaiankaloriAdapter.updateData(it)
    }
    binding.dashboardVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSliderrectangletwo.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSliderrectangletwo.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
    binding.btnSend.setOnClickListener {
      val destIntent = DataDiriActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_DATA_DIRI_ACTIVITY)
    }
    binding.btnSearch.setOnClickListener {
      val destIntent = ScanSayuranActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SCAN_SAYURAN_ACTIVITY)
    }
    binding.imageLock.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_LOGIN_ACTIVITY)
    }
  }

  fun onClickRecyclerListcapaiankalori(
    view: View,
    position: Int,
    item: ListcapaiankaloriRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DASHBOARD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DashboardActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
