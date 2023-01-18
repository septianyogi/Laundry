package com.example.teori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class YourOrder : AppCompatActivity() {
    lateinit var order_img_back : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_your_order)

        order_img_back = findViewById(R.id.order_img_back)

        order_img_back.setOnClickListener{
            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)
        }

    }
}