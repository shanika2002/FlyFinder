package com.example.flightbookingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BoardingPassPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_boarding_pass_page)

        var button40 = findViewById<Button>(R.id.button40)
        button40.setOnClickListener {
            val intent40 = Intent (this, PaymentPage::class.java)
            startActivity(intent40)
        }

        var button41 = findViewById<Button>(R.id.button41)
        button41.setOnClickListener {
            val intent41 = Intent (this, ProfilePage::class.java)
            startActivity(intent41)
        }

        var imageView1 = findViewById<ImageView>(R.id.imageView1)
        imageView1.setOnClickListener {
            val intent1 = Intent (this, HomePage::class.java)
            startActivity(intent1)
        }

        var imageView2 = findViewById<ImageView>(R.id.imageView2)
        imageView2.setOnClickListener {
            val intent2 = Intent (this, ProfilePage::class.java)
            startActivity(intent2)
        }

        var imageView3 = findViewById<ImageView>(R.id.imageView3)
        imageView3.setOnClickListener {
            val intent3 = Intent (this, BookingPage::class.java)
            startActivity(intent3)
        }


    }
}