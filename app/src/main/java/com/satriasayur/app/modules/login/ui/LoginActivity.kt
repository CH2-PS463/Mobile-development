package com.satriasayur.app.modules.login.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import com.satriasayur.app.R
import com.satriasayur.app.appcomponents.base.BaseActivity
import com.satriasayur.app.appcomponents.di.MyApp
import com.satriasayur.app.appcomponents.googleauth.GoogleHelper
import com.satriasayur.app.databinding.ActivityLoginBinding
import com.satriasayur.app.extensions.NoInternetConnection
import com.satriasayur.app.extensions.alert
import com.satriasayur.app.extensions.hideKeyboard
import com.satriasayur.app.extensions.isJSONObject
import com.satriasayur.app.extensions.neutralButton
import com.satriasayur.app.extensions.showProgressDialog
import com.satriasayur.app.modules.dashboard.ui.DashboardActivity
import com.satriasayur.app.modules.login.`data`.viewmodel.LoginVM
import com.satriasayur.app.modules.register.ui.RegisterActivity
import com.satriasayur.app.network.models.createlogin.CreateLoginResponse
import com.satriasayur.app.network.resources.ErrorResponse
import com.satriasayur.app.network.resources.SuccessResponse
import java.lang.Exception
import kotlin.Int
import kotlin.String
import kotlin.Unit
import org.json.JSONObject
import retrofit2.HttpException

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  private val REQUEST_CODE_DASHBOARD_ACTIVITY: Int = 239

  private val REQUEST_CODE_REGISTER_ACTIVITY: Int = 250

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error -> 

      })
    }

    override fun setUpClicks(): Unit {
      binding.linearRowdevicongoogle.setOnClickListener {
        googleLogin.login()
      }
      binding.btnMasuk.setOnClickListener {
        this@LoginActivity.hideKeyboard()
        viewModel.callCreateLoginApi()
      }
      binding.txtBelumpunyaaku.setOnClickListener {
        val destIntent = RegisterActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_REGISTER_ACTIVITY)
      }
    }

    override fun addObservers() {
      var progressDialog : AlertDialog? = null
      viewModel.progressLiveData.observe(this@LoginActivity) {
        if(it) {
          progressDialog?.dismiss()
          progressDialog = null
          progressDialog = this@LoginActivity.showProgressDialog()
        } else  {
          progressDialog?.dismiss()
        }
      }
      viewModel.createLoginLiveData.observe(this@LoginActivity) {
        if(it is SuccessResponse) {
          val response = it.getContentIfNotHandled()
          onSuccessCreateLogin(it)
        } else if(it is ErrorResponse)  {
          onErrorCreateLogin(it.data ?:Exception())
        }
      }
    }

    private fun onSuccessCreateLogin(response: SuccessResponse<CreateLoginResponse>) {
      viewModel.bindCreateLoginResponse(response.data)
      val destIntent = DashboardActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_DASHBOARD_ACTIVITY)
    }

    private fun onErrorCreateLogin(exception: Exception) {
      when(exception) {
        is NoInternetConnection -> {
          Snackbar.make(binding.root, exception.message?:"", Snackbar.LENGTH_LONG).show()
        }
        is HttpException -> {
          val errorBody = exception.response()?.errorBody()?.string()
          val errorObject = if (errorBody != null  && errorBody.isJSONObject())
              JSONObject(errorBody) else JSONObject()
          val errMessage = MyApp.getInstance().getString(R.string.msg_password_atau_usernamae_salah)
          this@LoginActivity.alert(MyApp.getInstance().getString(R.string.lbl_eror),errMessage) {
            neutralButton {
            }
          }
        }
      }
    }

    companion object {
      const val TAG: String = "LOGIN_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, LoginActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
