package com.example.teori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btn_lp_login : Button
    lateinit var btn_lp_register : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_lp_login = findViewById(R.id.btn_lp_login)
        btn_lp_register = findViewById(R.id.btn_lp_register)

        btn_lp_login.setOnClickListener{
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        btn_lp_register.setOnClickListener{
            val intent = Intent(this,Register::class.java)
            startActivity(intent)
        }
    }


}