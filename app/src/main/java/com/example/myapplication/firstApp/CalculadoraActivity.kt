package com.example.myapplication.firstApp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.R

class CalculadoraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_calculadora)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val etNumero1 : EditText = findViewById(R.id.etNumero1)
        val etNumero2 : EditText = findViewById(R.id.etNumero2)
        val btnSumar : Button = findViewById(R.id.btnSumar)
        val btnRestar : Button = findViewById(R.id.btnRestar)
        val btnMultiplicar : Button = findViewById(R.id.btnMultiplicar)
        val btnDividir : Button = findViewById(R.id.btnDividir)
        val tvResultado : TextView = findViewById(R.id.tvResultado)

        btnSumar.setOnClickListener {
            calcular(etNumero1, etNumero2, tvResultado, operacion = "+")
        }

        btnRestar.setOnClickListener {
            calcular(etNumero1, etNumero2, tvResultado, operacion = "-")
        }

        btnMultiplicar.setOnClickListener {
            calcular(etNumero1, etNumero2, tvResultado, operacion = "*")
        }

        btnDividir.setOnClickListener {
            calcular(etNumero1, etNumero2, tvResultado, operacion = "/")
        }

    }

    private fun calcular(et1: EditText, et2: EditText, resultado: TextView, operacion: String) {
        val num1 = et1.text.toString().toDoubleOrNull()
        val num2 = et2.text.toString().toDoubleOrNull()

        if (num1 == null || num2 == null){
            resultado.text = "Ingresa numeros validos"
            return
        }

        val resultadoFinal = when (operacion) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> if (num2 != 0.0) num1 / num2 else "No se puede dividir por 0"
            else -> "Operacion no valida "
        }

        resultado.text = resultadoFinal.toString()
    }
}