package com.example.pruebas_enclase

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pruebas_enclase.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNavigation.setOnClickListener {
            val intent = Intent(this, Detail::class.java)
            intent.putExtra("mensaje", "Te manda saludos el mencho")
            startActivity(intent)
        }
    }
}