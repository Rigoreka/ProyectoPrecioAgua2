package com.example.proyectoprecioagua

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectoprecioagua.databinding.ActivityP2017Binding

class P2017 : AppCompatActivity() {
    private lateinit var binding:ActivityP2017Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityP2017Binding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val  id=intent.getIntExtra("idmes",0)

        //obtener los datos de 2017
        val dato = Almacen.datos[id]

        // Mostrar los datos en la interfaz de usuario
        binding.txtResidencial.text = dato.Residencial.toString()
        binding.txtComercial.text = dato.Comercial.toString()
        binding.txtIndustrial.text = dato.Industrial.toString()
        binding.txtGobierno.text = dato.Gobierno.toString()
        binding.txtNacional.text=dato.Nacional.toString()

        //vista2017
        /*// Verificar si el año es el correcto
        if (year == 2017) {
            // Obtener los datos del año 2018 de Almacen
            val dato = Almacen.datos[id]

            // Mostrar los datos en la interfaz de usuario
            binding.txtResidencial.text = dato.Residencial.toString()
            binding.txtComercial.text = dato.Comercial.toString()
            binding.txtIndustrial.text = dato.Industrial.toString()
            binding.txtGob.text = dato.Gobierno.toString()
        }*/
    }
}