package com.example.proyectoprecioagua

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectoprecioagua.databinding.ActivityP2018Binding

class P2018 : AppCompatActivity() {
    private lateinit var binding: ActivityP2018Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding= ActivityP2018Binding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val  id=intent.getIntExtra("idmes",0)

        // Obtener los datos del año 2018 de Almacen
        val dato = Almacen.lista18[id]

        // Mostrar los datos en la interfaz de usuario
        binding.txtResidencial18.text = dato.Residencial.toString()
        binding.txtComercial18.text = dato.Comercial.toString()
        binding.txtIndustrial18.text = dato.Industrial.toString()
        binding.txtGobierno18.text = dato.Gobierno.toString()
        binding.txtNacional18.text=dato.Nacional.toString()

    }
}