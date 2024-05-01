package com.example.proyectoprecioagua

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectoprecioagua.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.btnPeriodo.setOnClickListener{
            val intent=Intent(this,Periodo94::class.java)
            startActivity(intent)
        }
        binding.btn2017.setOnClickListener{
            val intent=Intent(this,ListaMes::class.java)
            intent.putExtra("pos",0)
            startActivity(intent)
        }
        binding.btn2018.setOnClickListener{
            val intent=Intent(this,ListaMes::class.java)
            intent.putExtra("pos",1)
            startActivity(intent)
        }
        binding.btn2019.setOnClickListener {
            val intent= Intent(this,ListaMes::class.java)
            intent.putExtra("pos",2)
            startActivity(intent)
        }
        binding.btn2020.setOnClickListener{
            val intent=Intent(this,ListaMes::class.java)
            intent.putExtra("pos",3)
            startActivity(intent)
        }
        binding.btn2021.setOnClickListener {
            val intent= Intent(this,ListaMes::class.java)
            intent.putExtra("pos",4)
            startActivity(intent)
        }
        binding.btn2022.setOnClickListener {
            val intent=Intent(this, ListaMes::class.java)
            intent.putExtra("pos",5)
            startActivity(intent)
        }
    }
}