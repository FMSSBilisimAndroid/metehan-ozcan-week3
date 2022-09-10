package com.patika.week3appnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//Base Activity for Fragments
class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
    }
}