package com.yj.indicator.xxxindicator

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        item1.setOnClickListener {
            startActivity(Intent(this,Style1Activity::class.java))
        }
        item2.setOnClickListener {
            startActivity(Intent(this,Style2Activity::class.java))
        }
    }
}