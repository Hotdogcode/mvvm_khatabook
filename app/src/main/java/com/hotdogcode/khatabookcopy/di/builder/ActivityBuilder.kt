package com.hotdogcode.khatabookcopy.di.builder

import com.hotdogcode.khatabookcopy.view.SplashActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector
    abstract fun bindSplashActivity():SplashActivity
}
