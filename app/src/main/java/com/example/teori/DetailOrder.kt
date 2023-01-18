package com.example.teori

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import com.google.android.material.bottomsheet.BottomSheetDialog
import org.w3c.dom.Text

class DetailOrder : AppCompatActivity() {

    private lateinit var img_pewangi : ImageView
    lateinit var wangi : TextView

    private lateinit var img_pembayaran : ImageView
    lateinit var tv_pembayaran : TextView

    lateinit var tv_judul : TextView
    lateinit var tv_laundry : TextView

    lateinit var detail_img_back : ImageView
    lateinit var jumlah_baju : TextView
    lateinit var jumlah_celana : TextView
    lateinit var jumlah_jeans : TextView
    lateinit var jumlah_jaket : TextView
    lateinit var jumlah_selimut : TextView

    lateinit var total_harga_baju : TextView
    lateinit var total_harga_celana : TextView
    lateinit var total_harga_jeans : TextView
    lateinit var total_harga_jaket : TextView
    lateinit var total_harga_selimut : TextView

    lateinit var total_harga : TextView
    lateinit var total_harga_2 : TextView
    lateinit var btn_order : Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_order)

        img_pewangi = findViewById(R.id.img_pewangi)
        wangi = findViewById(R.id.wangi)

        img_pembayaran = findViewById(R.id.img_pembayaran)
        tv_pembayaran = findViewById(R.id.tv_pembayaran)

        tv_judul = findViewById(R.id.tv_judul)
        tv_laundry = findViewById(R.id.tv_laundry)

        detail_img_back = findViewById(R.id.detail_img_back)

        total_harga_baju = findViewById(R.id.total_harga_baju)
        total_harga_celana = findViewById(R.id.total_harga_celana)
        total_harga_jeans = findViewById(R.id.total_harga_jeans)
        total_harga_jaket = findViewById(R.id.total_harga_jaket)
        total_harga_selimut = findViewById(R.id.total_harga_selimut)
        total_harga = findViewById(R.id.total_harga)
        total_harga_2 = findViewById(R.id.total_harga_2)

        jumlah_baju = findViewById(R.id.jumlah_baju)
        jumlah_celana = findViewById(R.id.jumlah_celana)
        jumlah_jeans = findViewById(R.id.jumlah_jeans)
        jumlah_jaket = findViewById(R.id.jumlah_jaket)
        jumlah_selimut = findViewById(R.id.jumlah_selimut)

        btn_order =findViewById(R.id.btn_order)

        val bundle = intent.extras

        //Kode
        val kode = (bundle?.getString("kode")?.toInt())

        //Deklarasi harga ke Int
        val harga_baju = (bundle?.getString("harga_baju")?.toInt())
        val harga_celana = (bundle?.getString("harga_celana")?.toInt())
        val harga_jeans = (bundle?.getString("harga_jeans")?.toInt())
        val harga_jaket = (bundle?.getString("harga_jaket")?.toInt())
        val harga_selimut = (bundle?.getString("harga_selimut")?.toInt())

        //Deklarasi jumlah ke Int
        val baju = (bundle?.getString("jumlah_baju")?.toInt())
        val celana = (bundle?.getString("jumlah_celana")?.toInt())
        val jeans = (bundle?.getString("jumlah_jeans")?.toInt())
        val jaket = (bundle?.getString("jumlah_jaket")?.toInt())
        val selimut = (bundle?.getString("jumlah_selimut")?.toInt())


        //Hitung harga
        val total_baju = (baju?.let { harga_baju?.times(it) })?.toInt()
        val total_celana = (celana?.let { harga_celana?.times(it) })?.toInt()
        val total_jeans = (jeans?.let { harga_jeans?.times(it) })?.toInt()
        val total_jaket = (jaket?.let { harga_jaket?.times(it) })?.toInt()
        val total_selimut = (selimut?.let { harga_selimut?.times(it) })?.toInt()


        val total = (total_baju!! + total_celana!! + total_jeans!! + total_jaket!! + total_selimut!!).toString()

        //Harga
        total_harga_baju.setText(total_baju.toString())
        total_harga_celana.setText(total_celana.toString())
        total_harga_jeans.setText(total_jeans.toString())
        total_harga_jaket.setText(total_jaket.toString())
        total_harga_selimut.setText(total_selimut.toString())

        total_harga.setText(total)

        //Jumlah
        jumlah_baju.setText(bundle?.getString("jumlah_baju"))
        jumlah_celana.setText(bundle?.getString("jumlah_celana"))
        jumlah_jeans.setText(bundle?.getString("jumlah_jeans"))
        jumlah_jaket.setText(bundle?.getString("jumlah_jaket"))
        jumlah_selimut.setText(bundle?.getString("jumlah_selimut"))


        //JUDUL
        if (kode==1){
            tv_judul.setText("Cuci Basah")
        }
        else if (kode==2){
            tv_judul.setText("Cuci Basah Express")
        }
        else if (kode==3){
            tv_judul.setText("Dry Wash")
        }
        else if (kode==4){
            tv_judul.setText("Setrika")
        }

        if (kode==1){
            tv_laundry.setText("Cuci Basah")
        }
        else if (kode==2){
            tv_laundry.setText("Cuci Basah Express")
        }
        else if (kode==3){
            tv_laundry.setText("Dry Wash")
        }
        else if (kode==4){
            tv_laundry.setText("Setrika")
        }

        //BUTTON KEMBALI
        detail_img_back.setOnClickListener{
            if (kode==1){
                val intent = Intent(this, CuciBasah::class.java)
                startActivity(intent)
            }
            else if (kode==2){
                val intent = Intent(this, CuciBasahExpress::class.java)
                startActivity(intent)
            }

            else if (kode==3){
                val intent = Intent(this, DryWash::class.java)
                startActivity(intent)
            }

            else if (kode==4){
                val intent = Intent(this, Setrika::class.java)
                startActivity(intent)
            }

        }



        img_pewangi.setOnClickListener{
            popupPewangi()
        }
        wangi.setText(bundle?.getString("pewangi"))

        img_pembayaran.setOnClickListener{
            popupPembayaran()
        }
        tv_pembayaran.setText(bundle?.getString("pembayaran"))

        total_harga_2.setText(total)


        btn_order.setOnClickListener{
            val intent = Intent(this, YourOrder::class.java)
            startActivity(intent)
        }
    }


    private fun popupPembayaran(){
        val dialog = BottomSheetDialog(this)
        dialog.setContentView(R.layout.popup_pembayaran)

        val tunai = dialog.findViewById<TextView>(R.id.tunai)
        val transfer_bank = dialog.findViewById<TextView>(R.id.transfer_bank)
        val dana = dialog.findViewById<TextView>(R.id.dana)

        tunai?.setOnClickListener{
            val pembayaran = "Tunai"
            val intent = intent.putExtra("pembayaran", pembayaran)
            startActivity(intent)
        }
        transfer_bank?.setOnClickListener{
            val pembayaran = "Transfer Bank"
            val intent = intent.putExtra("pembayaran", pembayaran)
            startActivity(intent)
        }
        dana?.setOnClickListener{
            val pembayaran = "Dana"
            val intent = intent.putExtra("pembayaran", pembayaran)
            startActivity(intent)
        }
        dialog.show()
    }

    private fun popupPewangi(){
        val dialog = BottomSheetDialog(this)
        dialog.setContentView(R.layout.popup_pewangi)

        val pewangi1 = dialog.findViewById<TextView>(R.id.pewangi_1)
        val pewangi2 = dialog.findViewById<TextView>(R.id.pewangi_2)
        val pewangi3 = dialog.findViewById<TextView>(R.id.pewangi_3)
        val pewangi4 = dialog.findViewById<TextView>(R.id.pewangi_4)
        val pewangi5 = dialog.findViewById<TextView>(R.id.pewangi_5)
        pewangi1?.setOnClickListener{
            val pewangi = "Downy Floral Pink"
            val intent =
                intent.putExtra("pewangi", pewangi)
            startActivity(intent)
            dialog.dismiss()
        }
        pewangi2?.setOnClickListener{
            val pewangi = "Downy Mild Gentle"
            val intent =
                intent.putExtra("pewangi", pewangi)
            startActivity(intent)
            dialog.dismiss()
        }
        pewangi3?.setOnClickListener{
            val pewangi = "Downy Floral Pink"
            val intent =
                intent.putExtra("pewangi", pewangi)
            startActivity(intent)
            dialog.dismiss()
        }
        pewangi4?.setOnClickListener{
            val pewangi = "Molto Pewangi Purple"
            val intent =
                intent.putExtra("pewangi", pewangi)
            startActivity(intent)
            dialog.dismiss()
        }
        pewangi5?.setOnClickListener{
            val pewangi = "Molto Pure"
            val intent =
                intent.putExtra("pewangi", pewangi)
            startActivity(intent)
            dialog.dismiss()
        }
        dialog.show()
    }




//    private fun popupPewangi(){
//        val dialog = Dialog(this)
//        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
//        dialog.setContentView(R.layout.popup_pewangi)
//
//        val pewangi = dialog.findViewById<TextView>(R.id.pewangi)
//        pewangi.setOnClickListener{
//            val intent =
//            intent.putExtra("pewangi", pewangi.text.toString())
//            startActivity(intent)
//            dialog.dismiss()
//        }
//        dialog.show()
//    }


//    val bottomSheetDialog = BottomSheetDialog(
//        this@DetailOrder, R.style.BottomSheetDialogTheme
//    )
//
//    val bottomSheetView = LayoutInflater.from(applicationContext).inflate(
//        R.layout.popup_pewangi, findViewById<RelativeLayout>(R.id.bottom_sheet)
//    )
//
//    bottomSheetView.findViewById<TextView>(R.id.pewangi).setOnClickListener{
//
//        val pewangi = findViewById<TextView>(R.id.pewangi)
//        val intent = intent.putExtra("pewangi", pewangi.text.toString())
//        startActivity(intent)
//        bottomSheetDialog.dismiss()
//    }
//    bottomSheetDialog.setContentView(bottomSheetView)
//    bottomSheetDialog.show()
}