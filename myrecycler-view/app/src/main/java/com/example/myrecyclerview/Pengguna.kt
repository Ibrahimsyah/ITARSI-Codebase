package com.example.myrecyclerview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Pengguna(
    val nama: String,
    val alamat: String,
    val foto: String
) : Parcelable