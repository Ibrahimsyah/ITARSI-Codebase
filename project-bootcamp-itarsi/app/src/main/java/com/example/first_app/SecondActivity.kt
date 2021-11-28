package com.example.first_app

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        supportActionBar?.title = "Hello World"

        val dataProdi = listOf<Prodi>(
            Prodi(
                "Meteorologi",
                "Bidang Meteorologi umumnya berkaitan dengan fenomena di atmosfer dari aspek dinamis, fisis, komputasi meterologi, hingga oseanografi",
                R.drawable.meteo,
                "https://meteorologi.stmkg.ac.id/"
            ),
            Prodi(
                "Klimatologi",
                "Klimatologi merupakan ilmu yang mempelajari kualitas udara dan keadaan iklim",
                R.drawable.klimat,
                "https://klimatologi.stmkg.ac.id/"
            ),
            Prodi(
                "Geofisika",
                "Geofisika mempelajari ilmu yang menerapkan prinsip-prinsip fisika untuk mengetahui dan memecahkan masalah yang berhubungan dengan bumi",
                R.drawable.geof, "https://geofisika.stmkg.ac.id/"
            ),
            Prodi(
                "Instrumentasi",
                "Instrumentasi MKG menyiapkan teknisi BMKG yang handal dalam pengoperasian alat, kalibrasi, elektronika, perancangan dan rekayasa sistem, jaringan, dan lain-lain",
                R.drawable.ins,
                "https://instrumentasi.stmkg.ac.id/"
            ),
        )

        val rv = findViewById<RecyclerView>(R.id.rv_prodi)
        val adapter = ProdiAdapter(dataProdi) {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_PRODI, it)
            startActivity(intent)
        }

        rv.layoutManager = LinearLayoutManager(this)
        rv.setHasFixedSize(true)
        rv.adapter = adapter
    }
}
