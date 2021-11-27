package com.example.mypokemon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import coil.load

class DetailActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_POKEMON = "EXTRA_POKEMON"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val ivDetailImage = findViewById<ImageView>(R.id.iv_detail_image)
        val ivDetailSpecies = findViewById<TextView>(R.id.tv_detail_species)
        val ivDetailDescription = findViewById<TextView>(R.id.tv_detail_description)

        val pokemon = intent.getParcelableExtra<Pokemon>(EXTRA_POKEMON)

        pokemon?.let {
            ivDetailImage.load(it.image){
                crossfade(1000)
                crossfade(true)
            }
            ivDetailSpecies.text = it.species
            ivDetailDescription.text = it.description

            supportActionBar?.title = it.name
        }
    }
}