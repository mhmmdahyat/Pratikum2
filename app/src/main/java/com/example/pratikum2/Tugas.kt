package com.example.pratikum2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Tugas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tugas)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val etNim = findViewById<EditText>(R.id.et_NIM)
        val etNama = findViewById<EditText>(R.id.et_namaLengkap)
        val etProdi = findViewById<EditText>(R.id.et_prodi)
        val btnProses = findViewById<Button>(R.id.bt_proses)

        btnProses.setOnClickListener {
            val nim = etNim.text.toString()
            val nama = etNama.text.toString()
            val prodi = etProdi.text.toString()

            Toast.makeText(this, "Halo, perkenalkan saya $nama dengan NIM $nim pada Program Studi $prodi",
                Toast.LENGTH_SHORT).show()
        }
    }
}