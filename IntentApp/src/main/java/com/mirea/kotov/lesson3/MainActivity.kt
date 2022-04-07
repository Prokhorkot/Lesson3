package com.mirea.kotov.lesson3

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }


    fun onSendTimeBtnClick(view: View){
        val dateInMillis: Long = System.currentTimeMillis()
        val format = "yyy-MM-dd HH:mm:ss"
        val sdf = SimpleDateFormat(format)
        val dateString: String = sdf.format(Date(dateInMillis))

        val intent = Intent(this, SecondActivity().javaClass)
        intent.putExtra("time", dateString)
        startActivity(intent)
    }
}