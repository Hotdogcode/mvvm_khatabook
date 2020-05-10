package com.hotdogcode.khatabookcopy.di.builder

import com.hotdogcode.khatabookcopy.view.splash.SplashActivity
import com.hotdogcode.khatabookcopy.view.splash.SplashActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = [SplashActivityModule::class])
    abstract fun bindSplashActivity(): SplashActivity
}
