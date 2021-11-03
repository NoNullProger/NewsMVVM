package com.sports.newsmvvm

import android.app.Application
import com.sports.newsmvvm.di.AppComponent
import com.sports.newsmvvm.di.DaggerAppComponent

class App: Application() {

    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.create()
    }
}