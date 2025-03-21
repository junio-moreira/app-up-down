package br.com.moreira.updowncontrol

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnAumentar = findViewById<Button>(R.id.activity_main_btn_aumentar)
        val btnDiminuir = findViewById<Button>(R.id.activity_main_btn_diminuir)
        val txtContador = findViewById<TextView>(R.id.activity_main_txt_contador)

        btnAumentar.setOnClickListener {
            contador++
            txtContador.text = contador.toString()
        }

        btnDiminuir.setOnClickListener {
            contador--
            txtContador.text = contador.toString()
        }

    }
}