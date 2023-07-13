package com.msreddy.kotlinActivityLifeCycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dummy()
    }
    fun dummy()
    {
        Log.d("TAG", "dummy: ")
    }
}