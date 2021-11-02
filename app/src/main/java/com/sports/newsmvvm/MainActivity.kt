package com.sports.newsmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.arch.core.util.Function
import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData


class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var myServer: MyServer
    private lateinit var liveData: LiveData<String>
    private lateinit var newLiveData: LiveData<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myServer = MyServer()
        lifecycle.addObserver(myServer)



        button = findViewById(R.id.goToButton)
        button.setOnClickListener {
            DataController().setData()
        }

        liveData = DataController().getData()
        newLiveData = Transformations.map(liveData, object :Function<String, String>{
            override fun apply(input: String?): String {
                return "$input ${"get"}"
            }

        })
        newLiveData.observe(this, {
            println("!!!!!!!!!!!!!!!!!!!!!!!!!!new message ${it}")
        })

        val liveData1 = MutableLiveData<String>()
        val liveData2 = MutableLiveData<String>()

        val mediatorLiveData = MediatorLiveData<String>()
        mediatorLiveData.addSource(liveData1) { s -> mediatorLiveData.setValue(s) }
        mediatorLiveData.addSource(liveData2) { s -> mediatorLiveData.setValue(s) }
    }

    override fun onStop() {
        super.onStop()
        DataController().setData()
    }
}