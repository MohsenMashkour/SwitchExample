package com.mkrdeveloper.switchexample

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainLayout = findViewById<ConstraintLayout>(R.id.mainLayout1)
        val switch = findViewById<Switch>(R.id.switch1)

        switch.setOnCheckedChangeListener { compoundButton, state ->
            if (state) mainLayout.setBackgroundColor(Color.BLUE)
            if (!state) mainLayout.setBackgroundColor(Color.GREEN)
        }
    }
}