package com.satriasayur.app.modules.spalshscreen.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.satriasayur.app.R
import com.satriasayur.app.appcomponents.base.BaseActivity
import com.satriasayur.app.databinding.ActivitySpalshscreenBinding
import com.satriasayur.app.modules.dashboard.ui.DashboardActivity
import com.satriasayur.app.modules.spalshscreen.`data`.viewmodel.SpalshscreenVM
import kotlin.String
import kotlin.Unit

class SpalshscreenActivity :
    BaseActivity<ActivitySpalshscreenBinding>(R.layout.activity_spalshscreen) {
  private val viewModel: SpalshscreenVM by viewModels<SpalshscreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.spalshscreenVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = DashboardActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "SPALSHSCREEN_ACTIVITY"

    }
  }
