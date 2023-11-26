package com.purcell.msu.countingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var count = 0 // Initialize the counter to 0
    private lateinit var counterText: TextView
    private lateinit var clickButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        counterText = findViewById(R.id.counterText)
        clickButton = findViewById(R.id.clickButton)

        clickButton.setOnClickListener {
            count++
            updateCounter()
        }
    }

    private fun updateCounter() {
        counterText.text = "Count: $count"
    }


}