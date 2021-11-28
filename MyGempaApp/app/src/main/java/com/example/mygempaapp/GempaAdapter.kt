package com.example.mygempaapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mygempaapp.data.Gempa

class GempaAdapter : RecyclerView.Adapter<GempaAdapter.GempaViewHolder>() {
    val listGempa: MutableList<Gempa> = mutableListOf()

    fun setData(gempaList: List<Gempa>){
        listGempa.addAll(gempaList)
        notifyDataSetChanged()
    }

    inner class GempaViewHolder(view: View): RecyclerView.ViewHolder(view){
        val tvWilayah = itemView.findViewById<TextView>(R.id.tv_wilayah)
        val tvWaktu = itemView.findViewById<TextView>(R.id.tv_waktu)
        val tvKedalaman = itemView.findViewById<TextView>(R.id.tv_kedalaman)
        val tvPotensi = itemView.findViewById<TextView>(R.id.tv_potensi)

        fun bind(gempa: Gempa){
            tvWilayah.text = gempa.wilayah
            tvWaktu.text = "${gempa.tanggal} - ${gempa.jam}"
            tvKedalaman.text = gempa.kedalaman
            tvPotensi.text = gempa.potensi
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GempaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_gempa, parent, false)
        return GempaViewHolder(view)
    }

    override fun onBindViewHolder(holder: GempaViewHolder, position: Int) {
        holder.bind(listGempa[position])
    }

    override fun getItemCount(): Int = listGempa.size

}