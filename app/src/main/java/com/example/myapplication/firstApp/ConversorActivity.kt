package com.example.myapplication.firstApp

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.R

class ConversorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_conversor)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val spinner : Spinner = findViewById(R.id.spUnidades)
        val etValor : EditText = findViewById(R.id.etValor)
        val tvResultado : TextView = findViewById(R.id.tvResultado)
        val btnConversor : Button = findViewById(R.id.btnConversor)

        val opciones  = arrayOf(
            "Kilometros a Metros",
            "Metros a Kilometros",
            "Celsius a Fahrenheit",
            "Fahrenheit a Celsius",
            "Metros a centimetros",
            "Centimetros a Metros"
        )

        val adaptador = ArrayAdapter(this,android.R.layout.simple_spinner_item, opciones)
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adaptador

        btnConversor.setOnClickListener {
            val valorTexto = etValor.text.toString()
            if (valorTexto.isEmpty()){
                tvResultado.text = "Ingrese un valor"
                return@setOnClickListener
            }

            val valor = valorTexto.toDouble()
            val selection = spinner.selectedItem.toString()
            val resultado = when (selection) {
                "Kilometros a Metros" -> valor * 1000
                "Metros a Kilometros" -> valor / 1000
                "Celsius a Fahrenheit" -> (valor * 9/5) + 32
                "Fahrenheit a Celsius" -> (valor - 32) * 5/9
                "Metros a centimetros"-> valor * 100
                "Centimetros a Metros"-> valor / 100
                else -> 0.0
            }
            tvResultado.text = "Resultado: $resultado"
        }
    }
}