package com.example.flightbookingapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentManager
import com.google.android.material.navigation.NavigationView

class HomePage : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent20 = Intent (this, SignInPage::class.java)
            startActivity(intent20)
        }

        var button11 = findViewById<Button>(R.id.button11)
        button11.setOnClickListener {
            val intent21 = Intent (this, BookingPage::class.java)
            startActivity(intent21)
        }

        var imageView7 = findViewById<ImageView>(R.id.imageView7)
        imageView7.setOnClickListener {
            val intent7 = Intent (this, ProfilePage::class.java)
            startActivity(intent7)
        }

        var imageView9 = findViewById<ImageView>(R.id.imageView9)
        imageView9.setOnClickListener {
            val intent9 = Intent (this, HomePageMenu::class.java)
            startActivity(intent9)
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