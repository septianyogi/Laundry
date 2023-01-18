package com.example.teori


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Login : AppCompatActivity() {

    lateinit var img_log_back : ImageView
    lateinit var txt_log_register : TextView
    lateinit var btn_log_login : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        img_log_back = findViewById(R.id.img_log_back)
        txt_log_register = findViewById(R.id.txt_log_register)
        btn_log_login = findViewById(R.id.btn_log_login)

        img_log_back.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        txt_log_register.setOnClickListener{
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }

        this.btn_log_login.setOnClickListener{
            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)
        }
    }
}