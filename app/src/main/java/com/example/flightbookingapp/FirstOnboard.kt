package com.example.flightbookingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FirstOnboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_onboard)

        var button2 = findViewById<Button>(R.id.button12)
        button2.setOnClickListener {
            val intent2 = Intent (this, MainActivity::class.java)
            startActivity(intent2)
        }

        var button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val intent3 = Intent (this, SecondOnboard::class.java)
            startActivity(intent3)
        }




    }
}