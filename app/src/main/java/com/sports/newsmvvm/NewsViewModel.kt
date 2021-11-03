package com.sports.newsmvvm

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel

class NewsViewModel(application: Application): AndroidViewModel(application) {

    fun showAppName() {
        val context = getApplication<Application>().applicationContext
        println("!!!!!!!!!!!!!!!!!!!!!!!----------${context.getString(R.string.app_name)}")
    }


}