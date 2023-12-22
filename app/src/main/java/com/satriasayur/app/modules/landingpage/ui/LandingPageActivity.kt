package com.satriasayur.app.modules.landingpage.ui

import androidx.activity.viewModels
import com.satriasayur.app.R
import com.satriasayur.app.appcomponents.base.BaseActivity
import com.satriasayur.app.databinding.ActivityLandingPageBinding
import com.satriasayur.app.modules.landingpage.`data`.viewmodel.LandingPageVM
import kotlin.String
import kotlin.Unit

class LandingPageActivity : BaseActivity<ActivityLandingPageBinding>(R.layout.activity_landing_page)
    {
  private val viewModel: LandingPageVM by viewModels<LandingPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.landingPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LANDING_PAGE_ACTIVITY"

  }
}
