package com.example.teori


import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Setrika : AppCompatActivity() {

    var kode = 4;

    var num1 = 0;
    var num2 = 0;
    var num3 = 0;
    var num4 = 0;
    var num5 = 0;
    lateinit var img_min_1 : ImageView
    lateinit var img_plus_1 : ImageView
    lateinit var tv_jumlah_1 : TextView
    lateinit var img_min_2 : ImageView
    lateinit var img_plus_2 : ImageView
    lateinit var tv_jumlah_2 : TextView
    lateinit var img_min_3 : ImageView
    lateinit var img_plus_3 : ImageView
    lateinit var tv_jumlah_3 : TextView
    lateinit var img_min_4 : ImageView
    lateinit var img_plus_4 : ImageView
    lateinit var tv_jumlah_4 : TextView
    lateinit var img_min_5 : ImageView
    lateinit var img_plus_5 : ImageView
    lateinit var tv_jumlah_5 : TextView

    lateinit var setrika_img_back : ImageView
    lateinit var btn_order_now : Button

    lateinit var harga_baju : TextView
    lateinit var harga_celana : TextView
    lateinit var harga_jeans : TextView
    lateinit var harga_jaket : TextView
    lateinit var harga_selimut : TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setrika)

        img_min_1 = findViewById(R.id.img_min_1)
        img_plus_1 = findViewById(R.id.img_plus_1)
        tv_jumlah_1 = findViewById(R.id.tv_jumlah_1)
        img_min_2 = findViewById(R.id.img_min_2)
        img_plus_2 = findViewById(R.id.img_plus_2)
        tv_jumlah_2 = findViewById(R.id.tv_jumlah_2)
        img_min_3 = findViewById(R.id.img_min_3)
        img_plus_3 = findViewById(R.id.img_plus_3)
        tv_jumlah_3 = findViewById(R.id.tv_jumlah_3)
        img_min_4 = findViewById(R.id.img_min_4)
        img_plus_4 = findViewById(R.id.img_plus_4)
        tv_jumlah_4 = findViewById(R.id.tv_jumlah_4)
        img_min_5 = findViewById(R.id.img_min_5)
        img_plus_5 = findViewById(R.id.img_plus_5)
        tv_jumlah_5 = findViewById(R.id.tv_jumlah_5)

        setrika_img_back = findViewById(R.id.setrika_img_back)
        btn_order_now = findViewById(R.id.btn_order_now)

        harga_baju = findViewById(R.id.harga_baju)
        harga_celana = findViewById(R.id.harga_celana)
        harga_jeans = findViewById(R.id.harga_jeans)
        harga_jaket = findViewById(R.id.harga_jaket)
        harga_selimut = findViewById(R.id.harga_selimut)

        //1
        img_min_1.setOnClickListener{
            num1--
            tv_jumlah_1.text = num1.toString()
        }

        img_plus_1.setOnClickListener{
            num1++
            tv_jumlah_1.text = num1.toString()
        }


        //2
        img_min_2.setOnClickListener{
            num2--
            tv_jumlah_2.text = num2.toString()
        }

        img_plus_2.setOnClickListener{
            num2++
            tv_jumlah_2.text = num2.toString()
        }


        //3
        img_min_3.setOnClickListener{
            num3--
            tv_jumlah_3.text = num3.toString()
        }

        img_plus_3.setOnClickListener{
            num3++
            tv_jumlah_3.text = num3.toString()
        }


        //4
        img_min_4.setOnClickListener{
            num4--
            tv_jumlah_4.text = num4.toString()
        }

        img_plus_4.setOnClickListener{
            num4++
            tv_jumlah_4.text = num4.toString()
        }


        //5
        img_min_5.setOnClickListener{
            num5--
            tv_jumlah_5.text = num5.toString()
        }

        img_plus_5.setOnClickListener{
            num5++
            tv_jumlah_5.text = num5.toString()
        }


        btn_order_now.setOnClickListener{
            val intent = Intent(this, DetailOrder::class.java)
            intent.putExtra("kode", kode.toString())

            intent.putExtra("harga_baju", harga_baju.text.toString())
            intent.putExtra("harga_celana", harga_celana.text.toString())
            intent.putExtra("harga_jeans", harga_jeans.text.toString())
            intent.putExtra("harga_jaket", harga_jaket.text.toString())
            intent.putExtra("harga_selimut", harga_selimut.text.toString())

            intent.putExtra("jumlah_baju", tv_jumlah_1.text.toString())
            intent.putExtra("jumlah_celana", tv_jumlah_2.text.toString())
            intent.putExtra("jumlah_jeans", tv_jumlah_3.text.toString())
            intent.putExtra("jumlah_jaket", tv_jumlah_4.text.toString())
            intent.putExtra("jumlah_selimut", tv_jumlah_5.text.toString())
            startActivity(intent)
        }

        setrika_img_back.setOnClickListener{
            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)
        }
    }
}