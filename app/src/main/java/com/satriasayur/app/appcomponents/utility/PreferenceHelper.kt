package com.satriasayur.app.appcomponents.utility

import android.content.SharedPreferences
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKeys
import com.satriasayur.app.R
import com.satriasayur.app.appcomponents.di.MyApp
import kotlin.String
import kotlin.Unit

class PreferenceHelper {
  private val masterKeyAlias: String = createGetMasterKey()


  private val sharedPreference: SharedPreferences = EncryptedSharedPreferences.create(
  MyApp.getInstance().resources.getString(R.string.app_name),
  masterKeyAlias,
  MyApp.getInstance().applicationContext,
  EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
  EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
  )


  /**
   * Creates or gets the master key provided,
   * The encryption scheme is required fields to ensure that the type of encryption used is clear to
   * developers.
   *
   * @return the string value of encrypted key
   */
  private fun createGetMasterKey(): String = MasterKeys.getOrCreate(MasterKeys.AES256_GCM_SPEC)

  fun setStatus(paramValue: String?): Unit {
    with(sharedPreference.edit()) {
      this.putString("status", paramValue!!)
      apply()
    }
  }

  fun getStatus(): String? = sharedPreference.getString("status", null)

  fun setMessage(paramValue: String?): Unit {
    with(sharedPreference.edit()) {
      this.putString("message", paramValue!!)
      apply()
    }
  }

  fun getMessage(): String? = sharedPreference.getString("message", null)

  fun setAccesToken(paramValue: String?) {
    with(sharedPreference.edit()) {
      this.putString("accesToken", paramValue!!)
      apply()
    }
  }

  fun getAccesToken(): String? = sharedPreference.getString("accesToken", null)
}
