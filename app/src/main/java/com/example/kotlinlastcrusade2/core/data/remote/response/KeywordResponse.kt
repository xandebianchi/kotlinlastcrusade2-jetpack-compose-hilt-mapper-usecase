package com.example.kotlinlastcrusade2.core.data.remote.response

import com.example.kotlinlastcrusade2.core.data.remote.model.KeywordResult
import com.google.gson.annotations.SerializedName

data class KeywordResponse(
    @SerializedName("page")
    val page: Int = 0,
    @SerializedName("total_pages")
    val totalPages: Int = 0,
    @SerializedName("results")
    val results: List<KeywordResult>?,
    @SerializedName("total_results")
    val totalResults: Int = 0,
)
