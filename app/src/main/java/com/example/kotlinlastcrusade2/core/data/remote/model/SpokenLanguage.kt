package com.example.kotlinlastcrusade2.core.data.remote.model

import com.google.gson.annotations.SerializedName

data class SpokenLanguage(
    @SerializedName("name")
    val name: String = "",
    @SerializedName("iso_639_1")
    val iso: String = "",
    @SerializedName("english_name")
    val englishName: String = "",
)
