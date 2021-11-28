package com.example.mygempaapp.data

import com.google.gson.annotations.SerializedName

data class Gempa(
    @SerializedName("Tanggal")
    val tanggal: String,

    @SerializedName("Jam")
    val jam: String,

    @SerializedName("Wilayah")
    val wilayah: String,

    @SerializedName("Kedalaman")
    val kedalaman: String,

    @SerializedName("Potensi")
    val potensi: String
)