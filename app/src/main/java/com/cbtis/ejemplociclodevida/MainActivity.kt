package com.cbtis.ejemplociclodevida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var nombre = "Marcos"
    val NOMBRE = "nombre"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton = findViewById<Button>(R.id.boton)
        Toast.makeText(this, nombre, Toast.LENGTH_SHORT).show()

        boton.setOnClickListener {
            nombre = "Sergio"

            Toast.makeText(this, nombre, Toast.LENGTH_SHORT).show()

        }

    }

}