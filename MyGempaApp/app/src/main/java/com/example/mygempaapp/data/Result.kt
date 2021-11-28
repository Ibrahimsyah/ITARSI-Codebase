package com.example.mygempaapp.data

import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("Infogempa")
    val infoGempa: InfoGempa
)