package com.example.sondeneme

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class uyelikSayfasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_uyelik_sayfasi)
        val textA = findViewById<TextView>(R.id.aydinlatmaMetni)
        textA.setOnClickListener{
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.hurpass.com/m/uyelik-sozlesmesi")
            startActivity(openURL)
        }
        val uyeGirisButon = findViewById<TextView>(R.id.uyeGirisUye)
        uyeGirisButon.setOnClickListener{
            intent = Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
        }

    }
}