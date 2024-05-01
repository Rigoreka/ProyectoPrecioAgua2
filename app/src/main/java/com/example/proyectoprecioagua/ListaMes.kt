package com.example.proyectoprecioagua

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectoprecioagua.databinding.ActivityListaMesBinding

class ListaMes : AppCompatActivity() {
    private lateinit var binding: ActivityListaMesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityListaMesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val position=intent.getIntExtra("pos",-1)

        // Verificar la posición para determinar el enlace adecuado
        when (position) {
            0 -> { // Para el año 2017
                binding.listv1.adapter = Adaptador(this, Almacen.mes)
                binding.listv1.setOnItemClickListener { parent, view, position, objets ->
                    var idmes = Almacen.datos[position].id
                    var i = Intent(this, P2017::class.java)
                    i.putExtra("idmes", idmes)
                    startActivity(i)
                }
            }

            1 -> { // Para el año 2018
                binding.listv1.adapter = Adaptador(this, Almacen.mes)
                binding.listv1.setOnItemClickListener { parent, view, position, objets ->
                    var idmes = Almacen.lista18[position].id
                    var i = Intent(this, P2018::class.java)
                    i.putExtra("idmes", idmes)
                    startActivity(i)
                }
            }

            2 -> {//Para el 2019
                binding.listv1.adapter=Adaptador(this,Almacen.mes)
                binding.listv1.setOnItemClickListener{parent,view,position, objets ->
                    var idmes= Almacen.list19[position].id
                    var i=Intent(this,p2019::class.java)
                    i.putExtra("idmes",idmes)
                    startActivity(i)
                }
            }

            3 ->{//para 2020
                binding.listv1.adapter=Adaptador(this,Almacen.mes)
                binding.listv1.setOnItemClickListener{parent,view,position, objets ->
                    var idmes=Almacen.list20[position].id
                    var i=Intent(this,p2020::class.java)
                    i.putExtra("idmes",idmes)
                    startActivity(i)
                }
            }


            4 ->{//para 2021
                binding.listv1.adapter=Adaptador(this,Almacen.mes)
                binding.listv1.setOnItemClickListener{parent,view,position, objets ->
                    var idmes=Almacen.list21[position].id
                    var i=Intent(this,p2021::class.java)
                    i.putExtra("idmes",idmes)
                    startActivity(i)
                }
            }


            5 ->{//para 2022
                binding.listv1.adapter=Adaptador(this,Almacen.mes)
                binding.listv1.setOnItemClickListener{parent,view,position, objets ->
                    var idmes=Almacen.list22[position].id
                    var i=Intent(this,p2022::class.java)
                    i.putExtra("idmes",idmes)
                    startActivity(i)
                }
            }
        }
    }
}