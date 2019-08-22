package com.example.work3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*


class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.dice_image)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}
        //var resetButton:Button = findViewById(R.id.reset_button)
        //resetButton.setOnClickListener{resetButton()}



        val setButton: Button = findViewById(R.id.reset_button)

    }

    private fun rollDice(){
        val randomInt = Random().nextInt(6) + 1

        val drawableResource = when(randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
        //resultText.text = randomInt.toString()
        Toast.makeText(this,"button clicked",
            Toast.LENGTH_SHORT).show()
    }
   // private fun resetButton(){
        //val resultText: TextView  = findViewById(R.id.result_text)
       // resultText.text = "0"

   // }
}
