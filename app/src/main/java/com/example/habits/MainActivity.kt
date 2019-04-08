package com.example.habits

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iv_icon.setImageResource(R.drawable.water)
        tv_title.text = getString(R.string.drink_water)
        tv_description.text = getString(R.string.drink_water_description)
    }
}
