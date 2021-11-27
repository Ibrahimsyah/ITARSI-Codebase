package com.example.myrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import coil.load
import coil.transform.CircleCropTransformation

class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_PENGGUNA = "EXTRA_PENGGUNA"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val ivDetailFoto = findViewById<ImageView>(R.id.iv_detail_foto)
        val tvDetailNama = findViewById<TextView>(R.id.tv_detail_nama)

        val pengguna = intent.getParcelableExtra<Pengguna>(EXTRA_PENGGUNA)

        pengguna?.let {
            ivDetailFoto.load(it.foto){
                transformations(CircleCropTransformation())
            }
            tvDetailNama.text = it.nama
            supportActionBar?.title = "Detail ${it.nama}"
        }
    }

    // Ctrl + O
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.detail_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.menu_favorite -> {
                val intent = Intent(this, ContohActivity::class.java)
                startActivity(intent)
            }
            R.id.menu_1 -> {
                Toast.makeText(this, "Menu 1", Toast.LENGTH_SHORT).show()
            }
            else -> {
                Toast.makeText(this, "Menu 2", Toast.LENGTH_SHORT).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}