package com.mirea.kotov.systemintentsapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var callButton: Button? = null
    private var browserButton: Button? = null
    private var mapButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //region Объявление переменных View

        callButton = findViewById(R.id.callButton)
        browserButton = findViewById(R.id.browserButton)
        mapButton = findViewById(R.id.mapButton)

        //endregion

        //region Установка обрабатчиков нажатия

        callButton?.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:89811112233")
            startActivity(intent)
        }

        browserButton?.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("http://developer.android.com")
            startActivity(intent)
        }

        mapButton?.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("geo:55.749479,37.613944")
            startActivity(intent)

        }

        //endregion


    }
}