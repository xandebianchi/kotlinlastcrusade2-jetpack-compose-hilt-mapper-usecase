package com.example.kotlinlastcrusade2.core.data.remote.response

import com.example.kotlinlastcrusade2.core.data.remote.model.BelongsToCollection
import com.example.kotlinlastcrusade2.core.data.remote.model.GenresItem
import com.example.kotlinlastcrusade2.core.data.remote.model.ProductionCompany
import com.example.kotlinlastcrusade2.core.data.remote.model.ProductionCountry
import com.example.kotlinlastcrusade2.core.data.remote.model.SpokenLanguage
import com.google.gson.annotations.SerializedName

data class MovieDetailResponse(
    @SerializedName("original_language")
    val originalLanguage: String = "",
    @SerializedName("imdb_id")
    val imdbId: String = "",
    @SerializedName("video")
    val video: Boolean = false,
    @SerializedName("title")
    val title: String = "",
    @SerializedName("backdrop_path")
    val backdropPath: String = "",
    @SerializedName("revenue")
    val revenue: Int = 0,
    @SerializedName("genres")
    val genres: List<GenresItem>?,
    @SerializedName("popularity")
    val popularity: Double = 0.0,
    @SerializedName("production_countries")
    val productionCountries: List<ProductionCountry>?,
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("vote_count")
    val voteCount: Int = 0,
    @SerializedName("budget")
    val budget: Int = 0,
    @SerializedName("overview")
    val overview: String = "",
    @SerializedName("original_title")
    val originalTitle: String = "",
    @SerializedName("runtime")
    val runtime: Int = 0,
    @SerializedName("poster_path")
    val posterPath: String = "",
    @SerializedName("origin_country")
    val originCountry: List<String>?,
    @SerializedName("spoken_languages")
    val spokenLanguages: List<SpokenLanguage>?,
    @SerializedName("production_companies")
    val productionCompanies: List<ProductionCompany>?,
    @SerializedName("release_date")
    val releaseDate: String = "",
    @SerializedName("vote_average")
    val voteAverage: Double = 0.0,
    @SerializedName("belongs_to_collection")
    val belongsToCollection: BelongsToCollection,
    @SerializedName("tagline")
    val tagline: String = "",
    @SerializedName("adult")
    val adult: Boolean = false,
    @SerializedName("homepage")
    val homepage: String = "",
    @SerializedName("status")
    val status: String = "",
)
