package com.example.flightbookingapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignUpPage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_page)

        var button13 = findViewById<Button>(R.id.button13)
        button13.setOnClickListener {
            val intent13 = Intent (this, SignInPage::class.java)
            startActivity(intent13)
        }

        var button14 = findViewById<Button>(R.id.button14)
        button14.setOnClickListener {
            val intent14 = Intent (this, SignInPage::class.java)
            startActivity(intent14)
        }

        var button15 = findViewById<Button>(R.id.button15)
        button15.setOnClickListener {
            val intent15 = Intent (this, SignInPage::class.java)
            startActivity(intent15)
        }


    }
}