package com.sports.newsmvvm

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import androidx.lifecycle.LifecycleOwner

class MyServer(): LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    private fun connect() {
//        println("!!!!!!!!!!!!!!!!!!!!!!!!! connect")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    private fun disconnect() {
//        println("!!!!!!!!!!!!!!!!!!!!!!!!! disconnect")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    fun onAny(source: LifecycleOwner?, event: Lifecycle.Event?) {
       println("!!!!!!!!!!!!!!!!!!!!!!! ${source} !!!!! ${event}")
    }
}