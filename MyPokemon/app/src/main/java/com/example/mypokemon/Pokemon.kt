package com.example.mypokemon

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Pokemon(
    val name: String,
    val species: String,
    val image: String,
    val description: String
) : Parcelable