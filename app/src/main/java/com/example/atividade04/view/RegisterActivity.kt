package com.example.atividade04.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.atividade04.R

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        setTitle("New register")


        val btn = findViewById<Button>(R.id.button_register)

        btn.setOnClickListener{
            finish()
        }
    }
}