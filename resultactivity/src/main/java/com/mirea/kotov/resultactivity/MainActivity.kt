package com.mirea.kotov.resultactivity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    private var textViewResult: TextView? = null

    private val startForResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult ->
        if (result.resultCode == Activity.RESULT_OK) {
            val intent: Intent? = result.data

            if (intent != null) {
                val university: String? = intent.getStringExtra("name")
                setUniversityTextView(university);
            }
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewResult = findViewById(R.id.textViewResult)
        val getUniversityNameBtn: Button = findViewById(R.id.getUniversityNameBtn)

        getUniversityNameBtn.setOnClickListener {
            startForResult?.launch(Intent(this, DataActivity::class.java))
        }
    }

    private fun setUniversityTextView(university: String?){
        textViewResult?.text = university
    }
}
