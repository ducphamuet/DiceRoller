package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.diceroller.units.Dice


abstract class MainActivity : AppCompatActivity() {
    private val mDiceImg: ImageView = findViewById(R.id.diceImage)
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
        val imgRes = when (score) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6

            else -> R.drawable.dice_6
        }
        mDiceImg.setImageResource(imgRes);
        mDiceImg.contentDescription = score.toString()
    }
}