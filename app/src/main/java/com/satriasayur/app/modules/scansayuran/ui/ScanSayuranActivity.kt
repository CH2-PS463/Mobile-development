package com.satriasayur.app.modules.scansayuran.ui

import android.Manifest.permission.READ_EXTERNAL_STORAGE
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import com.satriasayur.app.R
import com.satriasayur.app.appcomponents.base.BaseActivity
import com.satriasayur.app.appcomponents.di.MyApp
import com.satriasayur.app.appcomponents.views.ImagePickerFragmentDialog
import com.satriasayur.app.databinding.ActivityScanSayuranBinding
import com.satriasayur.app.extensions.NoInternetConnection
import com.satriasayur.app.extensions.PickerHandler
import com.satriasayur.app.extensions.PickerHandler.OPEN_STORAGE_REQUEST_CODE
import com.satriasayur.app.extensions.PickerHandler.REQUEST_PERMISSION
import com.satriasayur.app.extensions.alert
import com.satriasayur.app.extensions.hideKeyboard
import com.satriasayur.app.extensions.isJSONObject
import com.satriasayur.app.extensions.neutralButton
import com.satriasayur.app.extensions.showProgressDialog
import com.satriasayur.app.modules.hasildeteksi.ui.HasilDeteksiActivity
import com.satriasayur.app.modules.scansayuran.`data`.viewmodel.ScanSayuranVM
import com.satriasayur.app.network.models.createpredict.CreatePredictResponse
import com.satriasayur.app.network.resources.ErrorResponse
import com.satriasayur.app.network.resources.SuccessResponse
import com.vmadalin.easypermissions.EasyPermissions
import com.vmadalin.easypermissions.EasyPermissions.PermissionCallbacks
import com.vmadalin.easypermissions.dialogs.SettingsDialog
import java.lang.Exception
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.IntArray
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import org.json.JSONObject
import retrofit2.HttpException

class ScanSayuranActivity :
    BaseActivity<ActivityScanSayuranBinding>(R.layout.activity_scan_sayuran), PermissionCallbacks {
  private val viewModel: ScanSayuranVM by viewModels<ScanSayuranVM>()

  private val REQUEST_CODE_HASIL_DETEKSI_ACTIVITY: Int = 533


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanSayuranVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowtelevision.setOnClickListener {
      this@ScanSayuranActivity.hideKeyboard()
      viewModel.callCreatePredictApi()
    }
    binding.linearRowcamera.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

    }
    binding.imageCamera.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

    }
    binding.linearRowsolargalleryb.setOnClickListener {
      if(!hasPermission(READ_EXTERNAL_STORAGE)) {
        requestPermission(READ_EXTERNAL_STORAGE)
      } else {
        val pickFile = PickerHandler.filePickerIntent()
        startActivityForResult(pickFile,OPEN_STORAGE_REQUEST_CODE)
      }
    }
  }

  override fun addObservers(): Unit {
    var progressDialog : AlertDialog? = null
    viewModel.progressLiveData.observe(this@ScanSayuranActivity) {
      if(it) {
        progressDialog?.dismiss()
        progressDialog = null
        progressDialog = this@ScanSayuranActivity.showProgressDialog()
      } else {
        progressDialog?.dismiss()
      }
    }
    viewModel.createPredictLiveData.observe(this@ScanSayuranActivity) {
      if(it is SuccessResponse) {
        val response = it.getContentIfNotHandled()
        onSuccessCreatePredict(it)
      } else if(it is ErrorResponse) {
        onErrorCreatePredict(it.data ?:Exception())
      }
    }
  }

  private fun onSuccessCreatePredict(response: SuccessResponse<CreatePredictResponse>): Unit {
    viewModel.bindCreatePredictResponse(response.data)
    val destBundle = Bundle()
    destBundle.putString("message",viewModel.createPredictLiveData.value?.getSuccessResponse()?.message)
    destBundle.putString("status",viewModel.createPredictLiveData.value?.getSuccessResponse()?.status)
    val destIntent = HasilDeteksiActivity.getIntent(this, destBundle)
    startActivityForResult(destIntent, REQUEST_CODE_HASIL_DETEKSI_ACTIVITY)
  }

  private fun onErrorCreatePredict(exception: Exception): Unit {
    when(exception) {
      is NoInternetConnection -> {
        Snackbar.make(binding.root, exception.message?:"", Snackbar.LENGTH_LONG).show()
      }
      is HttpException -> {
        val errorBody = exception.response()?.errorBody()?.string()
        val errorObject = if (errorBody != null  && errorBody.isJSONObject())
        JSONObject(errorBody) else JSONObject()
        val errMessage = if(!errorObject.optString("status").isNullOrEmpty()) {
          errorObject.optString("status").toString()
        } else {
          exception.response()?.message()?:""
        }
        this@ScanSayuranActivity.alert(MyApp.getInstance().getString(R.string.msg_gambar_tidak_terseteksi_coba_ul_lagi),errMessage) {
          neutralButton {
          }
        }
      }
    }
  }

  override fun onRequestPermissionsResult(
    requestCode: Int,
    permissions: Array<String>,
    grantResults: IntArray
  ): Unit {
    super.onRequestPermissionsResult(requestCode,permissions,grantResults)
    when(requestCode) {
      REQUEST_PERMISSION -> {
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults,
        this@ScanSayuranActivity)
      }
    }
  }

  private fun hasPermission(permission: String): Boolean {
    val checkPermission = EasyPermissions.hasPermissions(this@ScanSayuranActivity, permission)
    return checkPermission
  }

  override fun onActivityResult(
    requestCode: Int,
    resultCode: Int,
    `data`: Intent?
  ): Unit {
    super.onActivityResult(requestCode,resultCode,data)
    when(requestCode) {
      OPEN_STORAGE_REQUEST_CODE -> {
        if(resultCode == Activity.RESULT_OK) {
          val filePath: Uri = data?.data!!
        }
      }
    }
  }

  private fun requestPermission(permission: String): Unit {
    EasyPermissions.requestPermissions(this@ScanSayuranActivity,
    "This Application need Permission",
    REQUEST_PERMISSION,
    permission)
  }

  override fun onPermissionsDenied(requestCode: Int, perms: List<String>): Unit {
    if(EasyPermissions.somePermissionPermanentlyDenied(this@ScanSayuranActivity,*perms.toTypedArray())) {
      SettingsDialog.Builder(this@ScanSayuranActivity).build().show()
    }
  }

  override fun onPermissionsGranted(requestCode: Int, perms: List<String>): Unit {
    Toast.makeText(this@ScanSayuranActivity,R.string.msg_permission_granted,Toast.LENGTH_LONG).show()
  }

  companion object {
    const val TAG: String = "SCAN_SAYURAN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScanSayuranActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
