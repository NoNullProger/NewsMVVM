package com.sports.newsmvvm.di

import dagger.Component

@Component(
    modules = [NewsModule::class]
)
interface AppComponent {
}