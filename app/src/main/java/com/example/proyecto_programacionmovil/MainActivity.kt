package com.example.proyecto_programacionmovil
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyecto_programacionmovil.AcercaDe
import com.example.proyecto_programacionmovil.Contacto
import com.example.proyecto_programacionmovil.Menu
import com.example.proyecto_programacionmovil.R
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Set up button click listeners
        findViewById<MaterialButton>(R.id.btnMenu).setOnClickListener {
            startActivity(Intent(this, Menu::class.java))
        }

        findViewById<MaterialButton>(R.id.btnAboutUs).setOnClickListener {
            startActivity(Intent(this, AcercaDe::class.java))


        }

        findViewById<MaterialButton>(R.id.btnContact).setOnClickListener {
            startActivity(Intent(this, Contacto::class.java))
        }
    }
}
