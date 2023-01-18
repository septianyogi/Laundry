package com.example.teori

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Register : AppCompatActivity() {

    lateinit var img_reg_back : ImageView
    lateinit var btn_reg_register : Button
    lateinit var txt_reg_login : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        img_reg_back = findViewById(R.id.img_reg_back)
        btn_reg_register = findViewById(R.id.btn_reg_register)
        txt_reg_login =findViewById(R.id.txt_reg_login)

        img_reg_back.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        btn_reg_register.setOnClickListener{
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
        }

        txt_reg_login.setOnClickListener{
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
        }
    }
}