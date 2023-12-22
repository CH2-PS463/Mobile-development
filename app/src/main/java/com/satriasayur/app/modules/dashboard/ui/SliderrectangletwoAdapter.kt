package com.satriasayur.app.modules.dashboard.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.satriasayur.app.databinding.SlideritemDashboard1Binding
import com.satriasayur.app.modules.dashboard.`data`.model.ImageSliderSliderrectangletwoModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SliderrectangletwoAdapter(
  val dataList: ArrayList<ImageSliderSliderrectangletwoModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSliderrectangletwoModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemDashboard1Binding) {
      binding.imageSliderSliderrectangletwoModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemDashboard1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
