package com.example.kotlinlastcrusade2.core.data.remote.model

/**
 * IMPROVEMENT: ARCH-001
 *
 * Class that encapsulates query parameters for the movie discovery API.
 *
 * This refactoring was implemented to:
 * - Reduce the complexity of the `getMovies` method by avoiding long parameter lists.
 * - Improve modularity by centralizing the logic for handling parameters in a single class.
 * - Simplify future changes, allowing parameters to be added or modified without directly altering the API method.
 *
 * The logic for converting parameters to the API-compatible format (`Map<String, String>`) is implemented
 * in the `toQueryMap` function.
 * Related Class: MovieService.
 */
data class MovieQuery(
    val sortBy: String? = "popularity.desc",
    val releaseDateGte: String? = null,
    val releaseDateLte: String? = null,
    val withGenres: String? = null,
    val certification: String? = null,
    val language: String? = "en-US",
    val voteAverageGte: Double? = null,
    val voteAverageLte: Double? = null,
    val voteCountGte: Double? = null,
    val voteCountLte: Double? = null,
    val withKeywords: String? = null,
    val page: Int,
)

/**
 * IMPROVEMENT: ARCH-001
 *
 * Converts the encapsulated parameters in `MovieQuery` to the map format required by Retrofit.
 *
 * Benefits:
 * - Isolates parameter formatting logic, adhering to the Single Responsibility Principle (SRP).
 * - Reusable in other contexts that require the same parameters.
 * - Simplifies testing of specific cases, such as parameter validation.
 *
 * Usage example:
 * val queryMap = MovieQuery(page = 1, withGenres = "28").toQueryMap()
 * Retrofit then uses the `queryMap` in the `getMovies` method.
 */
fun MovieQuery.toQueryMap(): Map<String, String> =
    mutableMapOf<String, String>().apply {
        sortBy?.let { this["sort_by"] = it }
        releaseDateGte?.let { this["release_date.gte"] = it }
        releaseDateLte?.let { this["release_date.lte"] = it }
        withGenres?.let { this["with_genres"] = it }
        certification?.let { this["certification"] = it }
        language?.let { this["language"] = it }
        voteAverageGte?.let { this["vote_average.gte"] = it.toString() }
        voteAverageLte?.let { this["vote_average.lte"] = it.toString() }
        voteCountGte?.let { this["vote_count.gte"] = it.toString() }
        voteCountLte?.let { this["vote_count.lte"] = it.toString() }
        withKeywords?.let { this["with_keywords"] = it }
        this["page"] = page.toString()
    }
