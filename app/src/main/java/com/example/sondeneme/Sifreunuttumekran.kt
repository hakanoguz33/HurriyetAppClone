package com.example.sondeneme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Sifreunuttumekran : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sifre_unuttum_ekran)
        supportActionBar?.hide()
        val backText = findViewById<TextView>(R.id.uyeGirisText)
        backText.setOnClickListener{
            intent = Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
        }
    }
}