package com.example.rollrandomnumbers

import android.widget.Toast
import android.widget.Toast.makeText

class Dice(val numSides: Int) {
    fun roll(main : MainActivity): Int {
        val toast = makeText(main, "Rolled!", Toast.LENGTH_SHORT)
        toast.show()
        return (1..numSides).random()
    }
}