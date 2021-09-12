package com.example.rollrandomnumbers

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_btn)
        rollButton.setOnClickListener {
            val resultTextView: TextView = findViewById(R.id.rollResult_txt)
            val randomNumber = Dice(6);
            resultTextView.text = randomNumber.roll(this).toString()
        }
    }
}