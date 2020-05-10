package com.hotdogcode.khatabookcopy.view.splash

import androidx.lifecycle.ViewModelProvider
import com.hotdogcode.khatabookcopy.utilities.ViewModelProviderFactory
import dagger.Module
import dagger.Provides

@Module
class SplashActivityModule {

    @Provides
    fun provideViewModelFactory(splashViewModel: SplashViewModel):ViewModelProvider.Factory{
        return ViewModelProviderFactory(splashViewModel)
    }

    @Provides
    fun provideSplashViewModel():SplashViewModel{
        return SplashViewModel()
    }
}