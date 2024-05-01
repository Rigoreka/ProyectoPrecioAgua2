package com.example.proyectoprecioagua

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectoprecioagua.databinding.ActivityP2019Binding

class p2019 : AppCompatActivity() {
    private lateinit var binding: ActivityP2019Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityP2019Binding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val  id=intent.getIntExtra("idmes",0)

        // Obtener los datos del año 2019 de Almacen
        val dato = Almacen.list19[id]

        // Mostrar los datos en la interfaz de usuario
        binding.txtResidencial19.text = dato.Residencial.toString()
        binding.txtComercial19.text = dato.Comercial.toString()
        binding.txtIndustrial19.text = dato.Industrial.toString()
        binding.txtGob19.text = dato.Gobierno.toString()
        binding.txtNacional19.text=dato.Nacional.toString()

    }
}