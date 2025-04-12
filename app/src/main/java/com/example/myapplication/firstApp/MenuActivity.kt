package com.example.myapplication.firstApp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.R

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnCalculadora : Button = findViewById(R.id.btnCalculadora)
        val btnConversor : Button = findViewById(R.id.btnConversor)

        btnCalculadora.setOnClickListener {
            val intent = Intent(this,CalculadoraActivity::class.java)
            startActivity(intent)
        }

        btnConversor.setOnClickListener {
            val intent = Intent(this, ConversorActivity::class.java)
            startActivity(intent)
        }
    }
}