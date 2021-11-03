package com.sports.newsmvvm.di

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.sports.newsmvvm.NewsViewModel
import dagger.Module

@Module
class NewsModule {

    fun provideNewsModel(appCompatActivity: AppCompatActivity): NewsViewModel {
        return ViewModelProvider(appCompatActivity)[NewsViewModel::class.java]
//        ViewModelProvider(this)[NewsViewModel::class.java]
    }
}