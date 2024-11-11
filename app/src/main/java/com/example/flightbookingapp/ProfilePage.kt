package com.example.flightbookingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProfilePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_page)

        var button40 = findViewById<Button>(R.id.button40)
        button40.setOnClickListener {
            val intent40 = Intent (this, HomePage::class.java)
            startActivity(intent40)
        }

        var button42 = findViewById<Button>(R.id.button42)
        button42.setOnClickListener {
            val intent42 = Intent (this, EditProfilePage::class.java)
            startActivity(intent42)
        }


    }
}