package com.example.flightbookingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondOnboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_onboard)

        var button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            val intent4 = Intent (this, FirstOnboard::class.java)
            startActivity(intent4)
        }

        var button5 = findViewById<Button>(R.id.button5)
        button5.setOnClickListener {
            val intent5 = Intent (this, ThirdOnboard::class.java)
            startActivity(intent5)
        }
    }
}