package com.example.flightbookingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ForgetPasswordPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password_page)

        var button70 = findViewById<Button>(R.id.button70)
        button70.setOnClickListener {
            val intent70 = Intent (this, VerifyPasswordPage::class.java)
            startActivity(intent70)
        }

        var button61 = findViewById<Button>(R.id.button61)
        button61.setOnClickListener {
            val intent61 = Intent (this, SignInPage::class.java)
            startActivity(intent61)
        }

    }
}