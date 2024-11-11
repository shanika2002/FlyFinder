package com.example.flightbookingapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SelectingPage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selecting_page)

        var button35 = findViewById<Button>(R.id.button35)
        button35.setOnClickListener {
            val intent35 = Intent (this, BookingPage::class.java)
            startActivity(intent35)
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

        var textView50 = findViewById<TextView>(R.id.textView50)
        textView50.setOnClickListener {
            val intent50 = Intent (this, PaymentPage::class.java)
            startActivity(intent50)
        }



    }
}