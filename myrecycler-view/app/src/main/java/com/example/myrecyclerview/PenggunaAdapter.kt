package com.example.myrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.CircleCropTransformation

class PenggunaAdapter(
    val listPengguna: List<Pengguna>,
    val onClickListener: (Pengguna) -> Unit
) :
    RecyclerView.Adapter<PenggunaAdapter.PenggunaViewHolder>() {

    inner class PenggunaViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvNama = itemView.findViewById<TextView>(R.id.tv_nama)
        val tvAlamat = itemView.findViewById<TextView>(R.id.tv_alamat)
        val ivFoto = itemView.findViewById<ImageView>(R.id.iv_foto)

        fun bind(pengguna: Pengguna) {
            tvNama.text = pengguna.nama
            tvAlamat.text = pengguna.alamat
            ivFoto.load(pengguna.foto) {
                transformations(CircleCropTransformation())
            }

            itemView.setOnClickListener { onClickListener(pengguna) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PenggunaViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_pengguna, parent, false)
        return PenggunaViewHolder(view)
    }

    override fun onBindViewHolder(holder: PenggunaViewHolder, position: Int) {
        holder.bind(listPengguna[position])
    }

    override fun getItemCount(): Int = listPengguna.size

}