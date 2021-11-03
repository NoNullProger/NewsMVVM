package com.sports.newsmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.arch.core.util.Function
import androidx.lifecycle.*

class NewsActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var myServer: MyServer
    private lateinit var liveData: LiveData<String>
    private lateinit var newLiveData: LiveData<String>

    private lateinit var model: NewsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        model = ViewModelProvider(this)[NewsViewModel::class.java]
        model.showAppName()

//        myServer = MyServer()
//        lifecycle.addObserver(myServer)

//        button = findViewById(R.id.goToButton)
//        button.setOnClickListener {
//            DataController().setData()
//        }
//
//        liveData = DataController().getData()
//        newLiveData = Transformations.map(liveData, object :Function<String, String>{
//            override fun apply(input: String?): String {
//                return "$input ${"get"}"
//            }
//
//        })
//        newLiveData.observe(this, {
//            println("!!!!!!!!!!!!!!!!!!!!!!!!!!new message ${it}")
//        })

    }

//    override fun onStop() {
//        super.onStop()
//        DataController().setData()
//    }
}