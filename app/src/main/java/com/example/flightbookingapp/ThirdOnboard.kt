package com.example.flightbookingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ThirdOnboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_onboard)

        var button6 = findViewById<Button>(R.id.button6)
        button6.setOnClickListener {
            val intent6 = Intent (this, SignInPage::class.java)
            startActivity(intent6)
        }

        var button7 = findViewById<Button>(R.id.button7)
        button7.setOnClickListener {
            val intent7 = Intent (this, SecondOnboard::class.java)
            startActivity(intent7)
        }

    }
}