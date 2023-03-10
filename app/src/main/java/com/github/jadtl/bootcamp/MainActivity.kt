package com.github.jadtl.bootcamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, GreetingActivity::class.java)
            val nameField: EditText = findViewById(R.id.mainName)
            intent.putExtra("name", nameField.text.toString())
            startActivity(intent)
        }
    }
}