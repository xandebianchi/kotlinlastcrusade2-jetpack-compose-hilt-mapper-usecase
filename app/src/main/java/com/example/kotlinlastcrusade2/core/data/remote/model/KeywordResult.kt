package com.example.kotlinlastcrusade2.core.data.remote.model

import com.google.gson.annotations.SerializedName

data class KeywordResult(
    @SerializedName("name")
    val name: String = "",
    @SerializedName("id")
    val id: Int = 0,
)
