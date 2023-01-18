package com.example.teori


import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_dashboard.*

class Dashboard : AppCompatActivity() {

    lateinit var dash_tv_cuci_basah : TextView
    lateinit var dash_tv_express : TextView
    lateinit var dash_tv_dry : TextView
    lateinit var dash_tv_setrika :TextView

    lateinit var profile : ImageView
    lateinit var your_order : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        profile = findViewById(R.id.profile)
        your_order = findViewById(R.id.your_order)

        dash_tv_cuci_basah = findViewById(R.id.dash_tv_cuci_basah)
        dash_tv_express = findViewById(R.id.dash_tv_express)
        dash_tv_dry = findViewById(R.id.dash_tv_dry)
        dash_tv_setrika = findViewById(R.id.dash_tv_setrika)

        profile.setOnClickListener{
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }

        your_order.setOnClickListener{
            val intent = Intent(this, YourOrder::class.java)
            startActivity(intent)
        }

        dash_tv_cuci_basah.setOnClickListener{
            val intent = Intent(this, CuciBasah::class.java)
            startActivity(intent)
        }

        dash_tv_express.setOnClickListener{
            val intent = Intent(this, CuciBasahExpress::class.java)
            startActivity(intent)
        }

        dash_tv_dry.setOnClickListener{
            val intent = Intent(this, DryWash::class.java)
            startActivity(intent)
        }

        dash_tv_setrika.setOnClickListener{
            val intent = Intent(this, Setrika::class.java)
            startActivity(intent)
        }

    }
}