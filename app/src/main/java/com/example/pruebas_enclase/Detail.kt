package com.example.pruebas_enclase

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pruebas_enclase.databinding.DetailBinding

class Detail : AppCompatActivity() {

    lateinit var binding: DetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mensaje = intent.getStringExtra("mensaje")
        binding.txtMensaje.text = mensaje
    }
}