package com.example.mypokemon

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import coil.load

class PokemonAdapter(
    val pokemonList: List<Pokemon>,
    val listener: (Pokemon) -> Unit
) : RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder>(){

    inner class PokemonViewHolder(view: View): RecyclerView.ViewHolder(view){
        val iv_pokemon = itemView.findViewById<ImageView>(R.id.iv_image)

        fun bind(pokemon : Pokemon){
            iv_pokemon.load(pokemon.image){
                crossfade(true)

                itemView.setOnClickListener { listener(pokemon) }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_pokemon, parent, false)
        return PokemonViewHolder(view)
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        holder.bind(pokemonList[position])
    }

    override fun getItemCount(): Int {
        return pokemonList.size
    }
}