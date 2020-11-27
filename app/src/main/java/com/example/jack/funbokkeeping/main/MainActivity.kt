package com.example.jack.funbokkeeping.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.jack.funbokkeeping.FunApplication
import com.example.jack.funbokkeeping.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val context = FunApplication.resourceService
    }
}
