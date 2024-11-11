package com.example.flightbookingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class VerifyPasswordPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_password_page)

        var button70 = findViewById<Button>(R.id.button70)
        button70.setOnClickListener {
            val intent70 = Intent (this, SignInPage::class.java)
            startActivity(intent70)
        }

        var button71 = findViewById<Button>(R.id.button71)
        button71.setOnClickListener {
            val intent70 = Intent (this, ForgetPasswordPage::class.java)
            startActivity(intent70)
        }

        var button72 = findViewById<Button>(R.id.button72)
        button72.setOnClickListener {
            val intent70 = Intent (this, VerifyPasswordPage::class.java)
            startActivity(intent70)
        }

    }
}