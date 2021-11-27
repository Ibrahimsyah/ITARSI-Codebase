package com.example.mypokemon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pokemonData = listOf<Pokemon>(
            Pokemon(
                "Bulbasaur",
                "Seed",
                "https://cdn.traction.one/pokedex/pokemon/1.png",
                "While it is young, it uses the nutrients that are stored in the seeds on its back in order to grow."
            ),
            Pokemon(
                "Ivysaur",
                "Seed",
                "https://cdn.traction.one/pokedex/pokemon/2.png",
                "The bulb on its back grows as it absorbs nutrients. The bulb gives off a pleasant aroma when it blooms."
            ),
            Pokemon(
                "Venusaur",
                "Seed",
                "https://cdn.traction.one/pokedex/pokemon/3.png",
                "As it warms itself and absorbs the sunlight, its flower petals release a pleasant fragrance."
            ),
        )

        val rvPokemon = findViewById<RecyclerView>(R.id.rv_pokemon)
        val adapter = PokemonAdapter(pokemonData){
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_POKEMON, it)
            startActivity(intent)
        }

        rvPokemon.layoutManager = GridLayoutManager(this, 2)
        rvPokemon.setHasFixedSize(true)
        rvPokemon.adapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu_profile -> {
                val intent = Intent(this, ProfileActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}