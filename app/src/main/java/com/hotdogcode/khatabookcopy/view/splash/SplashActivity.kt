package com.hotdogcode.khatabookcopy.view.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.hotdogcode.khatabookcopy.R
import com.hotdogcode.khatabookcopy.data.local.prefs.AppPrefHelper
import com.hotdogcode.khatabookcopy.data.model.prefs.User
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class SplashActivity : AppCompatActivity() {


    @Inject lateinit var viewModelfactory : ViewModelProvider.Factory
    private lateinit var splashViewModel:SplashViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun setup(){
        splashViewModel = ViewModelProvider(this,viewModelfactory).get(SplashViewModel::class.java)
    }
}
