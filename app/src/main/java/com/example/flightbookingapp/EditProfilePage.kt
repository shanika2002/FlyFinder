package com.example.flightbookingapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EditProfilePage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile_page)

        var button40 = findViewById<Button>(R.id.button40)
        button40.setOnClickListener {
            val intent40 = Intent (this, ProfilePage::class.java)
            startActivity(intent40)
        }

        var button43 = findViewById<Button>(R.id.button43)
        button43.setOnClickListener {
            val intent43 = Intent (this, ProfilePage::class.java)
            startActivity(intent43)
        }


    }
}