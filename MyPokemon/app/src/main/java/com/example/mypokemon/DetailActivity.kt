package com.example.mypokemon

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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
        val btnWiki = findViewById<Button>(R.id.btn_link)

        val pokemon = intent.getParcelableExtra<Pokemon>(EXTRA_POKEMON)

        pokemon?.let { pokemon ->
            ivDetailImage.load(pokemon.image){
                crossfade(1000)
                crossfade(true)
            }
            ivDetailSpecies.text = pokemon.species
            ivDetailDescription.text = pokemon.description

            btnWiki.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse(pokemon.link))
                startActivity(intent)
            }
            supportActionBar?.title = pokemon.name
        }
    }
}