package com.hotdogcode.khatabookcopy.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hotdogcode.khatabookcopy.R
import com.hotdogcode.khatabookcopy.data.local.prefs.AppPrefHelper
import com.hotdogcode.khatabookcopy.data.model.prefs.User
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class SplashActivity : AppCompatActivity() {


    @Inject lateinit var pref:AppPrefHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}
