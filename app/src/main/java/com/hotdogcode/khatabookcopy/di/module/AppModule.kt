package com.hotdogcode.khatabookcopy.di.module

import android.content.Context
import com.hotdogcode.khatabookcopy.App
import com.hotdogcode.khatabookcopy.di.PreferenceInfo
import com.hotdogcode.khatabookcopy.utilities.PREF_NAME
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {


    @Provides
    @Singleton
    fun provideContext(app:App):Context{
        return app
    }

    @Provides
    @PreferenceInfo
    fun providePrefName():String{
        return PREF_NAME
    }

}