package com.example.proyectoprecioagua

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectoprecioagua.databinding.ActivityP2022Binding

class p2022 : AppCompatActivity() {
    private lateinit var binding: ActivityP2022Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding= ActivityP2022Binding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val  id=intent.getIntExtra("idmes",0)

        // Obtener los datos del año 2019 de Almacen
        val dato = Almacen.list22[id]

        // Mostrar los datos en la interfaz de usuario
        binding.txtResidencial22.text = dato.Residencial
        binding.txtComercial22.text = dato.Comercial
        binding.txtIndustrial22.text = dato.Industrial
        binding.txtGob22.text = dato.Gobierno
        binding.txtNacional22.text=dato.Nacional
    }
}