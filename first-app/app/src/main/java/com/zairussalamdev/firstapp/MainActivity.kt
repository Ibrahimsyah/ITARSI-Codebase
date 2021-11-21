package com.zairussalamdev.firstapp

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import coil.load
import coil.transform.CircleCropTransformation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ivFoto = findViewById<ImageView>(R.id.iv_foto)
        val tvNama = findViewById<TextView>(R.id.tv_nama)
        val tvAlamat = findViewById<TextView>(R.id.tv_alamat)
        val tvDeskripsi = findViewById<TextView>(R.id.tv_deskripsi)
        val btnAction = findViewById<Button>(R.id.btn_hello)
        val etNama = findViewById<EditText>(R.id.et_nama)

        ivFoto.load(R.drawable.foto) {
            crossfade(true)
            transformations(CircleCropTransformation())
        }
        tvNama.text = "Ibrahimsyah Zairussalam"
        tvAlamat.text = "Malang, Jawa Timur"
        tvDeskripsi.text =
            "Halo Perkenalkan semua namaku Ibrahimsyah Zairussalam, sering dipanggil Ibrahim. Aku berasal dari Malang, Provinsi Jawa Timur dan saat ini sedang menempuh pendidikan Semester 7 di Universitas Brawijaya jurusan Sistem Informasi. Saya bangga mengikuti bootcamp ITARSI STMKG 2021"

        btnAction.setOnClickListener {
            val namaPengguna = etNama.text.toString()
            if (namaPengguna.isNotEmpty()) {
                val intent = Intent(this@MainActivity, InfoActivity::class.java)
                intent.putExtra(InfoActivity.EXTRA_NAME, namaPengguna)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Nama harus diisi", Toast.LENGTH_SHORT).show()
            }
        }
    }
}