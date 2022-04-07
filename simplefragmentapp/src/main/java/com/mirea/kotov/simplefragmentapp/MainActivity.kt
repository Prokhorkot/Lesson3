package com.mirea.kotov.simplefragmentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
    private var buttonFragment1: Button? = null
    private var buttonFragment2: Button? = null
    private var fragmentManager: FragmentManager? = null
    private var fragment1: Fragment? = null
    private var fragment2: Fragment? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //region Объявление переменных View

        buttonFragment1 = findViewById(R.id.buttonFragment1)
        buttonFragment2 = findViewById(R.id.buttonFragment2)
        fragment1 = Fragment1()
        fragment2 = Fragment2()

        //endregion

        //region Установка обрабатчиков нажатия

        buttonFragment1?.setOnClickListener{
            fragmentManager = supportFragmentManager
            fragmentManager?.beginTransaction()?.replace(
                R.id.fragmentContainer,
                fragment1 as Fragment1
            )?.commit()
        }

        buttonFragment2?.setOnClickListener{
            fragmentManager = supportFragmentManager
            fragmentManager?.beginTransaction()?.replace(
                R.id.fragmentContainer,
                fragment2 as Fragment2
            )?.commit()
        }

        //endregion
    }
}