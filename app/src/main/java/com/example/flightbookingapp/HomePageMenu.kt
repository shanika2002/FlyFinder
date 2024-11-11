package com.example.flightbookingapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomePageMenu : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home_page_menu)


        var imageView1 = findViewById<ImageView>(R.id.imageView1)
        imageView1.setOnClickListener {
            val intent1 = Intent (this, HomePage::class.java)
            startActivity(intent1)
        }

        var textView95 = findViewById<TextView>(R.id.textView95)
        textView95.setOnClickListener {
            val intent95 = Intent (this, HomePage::class.java)
            startActivity(intent95)
        }

        var textView96 = findViewById<TextView>(R.id.textView96)
        textView96.setOnClickListener {
            val intent96 = Intent (this, BookingPage::class.java)
            startActivity(intent96)
        }

        var textView97 = findViewById<TextView>(R.id.textView97)
        textView97.setOnClickListener {
            val intent97 = Intent (this, ProfilePage::class.java)
            startActivity(intent97)
        }





    }
}