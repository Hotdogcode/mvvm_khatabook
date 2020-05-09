package com.hotdogcode.khatabookcopy.data.local.prefs

import android.content.Context
import android.content.SharedPreferences
import com.hotdogcode.khatabookcopy.data.model.prefs.User
import com.hotdogcode.khatabookcopy.di.PreferenceInfo
import javax.inject.Inject

class AppPrefHelper @Inject constructor(context: Context, @PreferenceInfo prefFileName:String):PrefHelper {


    //Keys
    private val _prefKeyUserId = "PREF_KEY_USER_ID"
    private val _prefKeyUserPhone = "PREF_KEY_USER_PHONE"
    private val _prefKeyUserBusinessName = "PREF_KEY_USER_BUSINESS_NAME"


    private val mPrefs:SharedPreferences = context.getSharedPreferences(prefFileName,Context.MODE_PRIVATE)



    override fun setUser(user: User) {
        //TODO  Check if possible to use same editor for multiple apply
        val editor = mPrefs.edit()
        editor.putString(_prefKeyUserId,user.user_id).apply()
        editor.putString(_prefKeyUserPhone,user.user_phone).apply()
        editor.putString(_prefKeyUserBusinessName,user.business_name).apply()
    }

    override fun getUser(): User {
        val id = mPrefs.getString(_prefKeyUserId,"dsgs")?:""
        val phone = mPrefs.getString(_prefKeyUserPhone,"")?:""
        val businessName = mPrefs.getString(_prefKeyUserBusinessName,"")?:""
        return User(id,phone,businessName)
    }
}