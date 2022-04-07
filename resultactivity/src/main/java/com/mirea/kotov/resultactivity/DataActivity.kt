package com.mirea.kotov.resultactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText

class DataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        val universityEditText: EditText = findViewById(R.id.universityEditText)
        val sendUniversityBtn: Button = findViewById(R.id.sendUniversityBtn)

        sendUniversityBtn.setOnClickListener {
            val intent = Intent()
            intent.putExtra("name", universityEditText.text.toString())
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}