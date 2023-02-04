package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val scoreText: TextView = findViewById(R.id.score_text)
        val rollBtn: Button = findViewById(R.id.roll_btn)
        rollBtn.setOnClickListener {
            val range: IntRange = 1..6
            var score: Int = range.random();
            scoreText.text = score.toString()
        }
    }
}