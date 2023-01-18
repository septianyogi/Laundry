package com.example.teori

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Profile : AppCompatActivity() {
    lateinit var profile_back : ImageView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        profile_back = findViewById(R.id.profile_back)

        profile_back.setOnClickListener{
            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)
        }
    }
}