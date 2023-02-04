package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.diceroller.units.Dice


abstract class MainActivity : AppCompatActivity() {
    private val mScoreText: TextView = findViewById(R.id.score_text)
    private val mRollBtn: Button = findViewById(R.id.roll_btn)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mRollBtn.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val score: Int = dice.roll()
        mScoreText.text = score.toString()
    }
}