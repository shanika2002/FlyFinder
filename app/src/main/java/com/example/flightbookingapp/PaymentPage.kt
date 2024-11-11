package com.example.flightbookingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PaymentPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_page)

        var button40 = findViewById<Button>(R.id.button40)
        button40.setOnClickListener {
            val intent40 = Intent (this, SelectingPage::class.java)
            startActivity(intent40)
        }
        var button23 = findViewById<Button>(R.id.button23)
        button23.setOnClickListener {
            val intent23 = Intent (this, BoardingPassPage::class.java)
            startActivity(intent23)
        }


    }
}