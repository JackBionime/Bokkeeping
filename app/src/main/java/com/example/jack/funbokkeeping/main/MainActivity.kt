package com.example.jack.funbokkeeping.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.jack.fun_utlis.logD
import com.example.jack.funbokkeeping.FunApplication
import com.example.jack.funbokkeeping.R

class MainActivity : AppCompatActivity() {

    private val databaseManager by lazy {
        FunApplication.application.databaseManager
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val test = databaseManager.configurationImpl().getConfig("Test", "testName", "")
        logD("test $test")
    }
}
