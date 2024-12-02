package com.example.kotlinlastcrusade2.core.data.remote.response

import com.example.kotlinlastcrusade2.core.data.remote.model.MovieResult
import com.google.gson.annotations.SerializedName

data class MovieResponse(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val results: List<MovieResult>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("totalResults")
    val totalResults: Int,
)
