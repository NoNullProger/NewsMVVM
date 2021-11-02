package com.sports.newsmvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class DataController {

    companion object {
        private var index = 0
        private var listObject = arrayListOf<String>("Item 1", "Item 2", "Item 3")
        private var livedata: MutableLiveData<String> = MutableLiveData()
    }

    fun getData(): LiveData<String> {
        return livedata
    }

    fun setData() {
        livedata.value = listObject[index]
        if (index == 2) {
            index = 0
        } else {
            index++
        }
    }
}