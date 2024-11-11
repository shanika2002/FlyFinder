package com.example.flightbookingapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignInPage : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_page)

        var button8 = findViewById<Button>(R.id.button70)
        button8.setOnClickListener {
            val intent8 = Intent (this, ThirdOnboard::class.java)
            startActivity(intent8)
        }

        var button9 = findViewById<Button>(R.id.button9)
        button9.setOnClickListener {
            val intent9 = Intent (this, HomePage::class.java)
            startActivity(intent9)
        }

        var textView91 = findViewById<TextView>(R.id.textView91)
        textView91.setOnClickListener {
            val intent91 = Intent (this, SignUpPage::class.java)
            startActivity(intent91)
        }

        var button10 = findViewById<Button>(R.id.button10)
        button10.setOnClickListener {
            val intent10 = Intent (this, VerifyPasswordPage::class.java)
            startActivity(intent10)
        }



    }
}