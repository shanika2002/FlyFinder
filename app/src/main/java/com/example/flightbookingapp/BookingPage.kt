package com.example.flightbookingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BookingPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking_page)

        var button19 = findViewById<Button>(R.id.button19)
        button19.setOnClickListener {
            val intent19 = Intent (this, HomePage::class.java)
            startActivity(intent19)
        }

        var button22 = findViewById<Button>(R.id.button22)
        button22.setOnClickListener {
            val intent22 = Intent (this, SelectingPage::class.java)
            startActivity(intent22)
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