package com.hotdogcode.khatabookcopy.di.components

import com.hotdogcode.khatabookcopy.App
import com.hotdogcode.khatabookcopy.di.builder.ActivityBuilder
import com.hotdogcode.khatabookcopy.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class,AppModule::class,ActivityBuilder::class])
interface AppComponent {
    fun inject(app:App)

    @Component.Builder
    interface Builder{
        @BindsInstance
        fun application(app: App):Builder

        fun build():AppComponent
    }
}