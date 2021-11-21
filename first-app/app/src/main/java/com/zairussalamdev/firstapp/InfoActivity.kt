package com.zairussalamdev.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class InfoActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_NAME = "EXTRA_NAME"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val name = intent.getStringExtra(EXTRA_NAME) ?: "MrX"

        val tvGreeting = findViewById<TextView>(R.id.tv_greeting)
        val btnBack = findViewById<Button>(R.id.btn_back)

        tvGreeting.text = "Haloooo $name, Salam Kenal!"
        btnBack.setOnClickListener {
            // Akan balik ke halaman sebelumnya
            super.onBackPressed()
        }
    }
}