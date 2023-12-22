package com.satriasayur.app.modules.hasilperiksasementara.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.satriasayur.app.R
import com.satriasayur.app.appcomponents.base.BaseActivity
import com.satriasayur.app.databinding.ActivityHasilPeriksaSementaraBinding
import com.satriasayur.app.modules.hasilperiksasementara.`data`.viewmodel.HasilPeriksaSementaraVM
import kotlin.String
import kotlin.Unit

class HasilPeriksaSementaraActivity :
    BaseActivity<ActivityHasilPeriksaSementaraBinding>(R.layout.activity_hasil_periksa_sementara) {
  private val viewModel: HasilPeriksaSementaraVM by viewModels<HasilPeriksaSementaraVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.hasilPeriksaSementaraVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "HASIL_PERIKSA_SEMENTARA_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HasilPeriksaSementaraActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
