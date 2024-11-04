package com.example.proyecto_programacionmovil

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        // Configurar el padding para el layout principal
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Referencias a los botones
        val btnFrappé = findViewById<Button>(R.id.btnFrappé)
        val btnCapuchino = findViewById<Button>(R.id.btnCapuchino)
        val btnMoccaBlanco = findViewById<Button>(R.id.btnMoccaBlanco)
        val btnAffogato = findViewById<Button>(R.id.btnAffogato)

        // Configurar listeners para cada botón
        btnFrappé.setOnClickListener {
            val intent = Intent(this, InfoFrappe::class.java)
            startActivity(intent)
        }

        btnCapuchino.setOnClickListener {
            val intent = Intent(this, InfoFrappe::class.java)
            startActivity(intent)
        }

        btnMoccaBlanco.setOnClickListener {
            val intent = Intent(this, InfoFrappe::class.java)
            startActivity(intent)
        }

        btnAffogato.setOnClickListener {
            val intent = Intent(this, InfoFrappe::class.java)
            startActivity(intent)
        }
    }
}
