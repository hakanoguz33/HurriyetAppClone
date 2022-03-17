package com.example.sondeneme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

import android.content.Intent
import android.net.Uri
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide() // üst bar gizleme
        var button = findViewById<Button>(R.id.girisYapButton) // button bulunuyor
        var ePostaEdit = findViewById<EditText>(R.id.ePostaEditText)
        var sifreEdit = findViewById<EditText>(R.id.sifreEditText)
        button.setOnClickListener{ //button kodları
            if (ePostaEdit.text.toString()=="" || sifreEdit.text.toString() == ""){
                ePostaEdit.setError("E-posta Hatalı")
                sifreEdit.setError("Şifre Hatalı")
            }
        }
        var sifreUnuttum = findViewById<TextView>(R.id.sifreUnuttumText)
        sifreUnuttum.setOnClickListener{
            intent = Intent(applicationContext,Sifreunuttumekran::class.java)
            startActivity(intent)
        }
        val textA = findViewById<TextView>(R.id.aydinlatmaMetni)
        textA.setOnClickListener{
            val openURL = Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.hurpass.com/m/uyelik-sozlesmesi")
            startActivity(openURL)
        }
        val uyelikButon = findViewById<TextView>(R.id.uyeliginizYok)
        val hesapButon = findViewById<TextView>(R.id.hesapOlustur)
        hesapButon.setOnClickListener{
            intent= Intent(applicationContext,hesapOlustur::class.java)
            startActivity(intent)
        }
        uyelikButon.setOnClickListener{
            intent= Intent(applicationContext,uyelikSayfasi::class.java)
            startActivity(intent)
        }
}
}
