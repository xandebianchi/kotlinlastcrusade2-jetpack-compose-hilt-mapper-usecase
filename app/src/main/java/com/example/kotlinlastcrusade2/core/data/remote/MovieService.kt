package com.example.kotlinlastcrusade2.core.data.remote

import com.example.kotlinlastcrusade2.core.data.remote.response.MovieResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.QueryMap

interface MovieService {
    /**
     * IMPROVEMENT: ARCH-001
     *
     * Method to fetch movies from the discovery API.
     *
     * Refactoring:
     * This method was simplified by using the `MovieQuery` class to encapsulate the query parameters.
     * Previously, this method had a long list of individual parameters, making it harder to read and maintain.
     *
     * Benefits:
     * - Cleaner and more maintainable code.
     * - Allows adding or modifying encapsulated parameters in `MovieQuery` without directly altering this method.
     *
     * The logic for formatting the parameters was delegated to the `MovieQuery.toQueryMap()` function.
     */
    @GET("/discover/movie")
    suspend fun getMovies(
        @QueryMap options: Map<String, String>,
    ): MovieResponse

    @GET("/movie/{movie_id}")
    suspend fun getMovieDetails(
        @Path("movie_id") movieId: Int,
        @Query("language") language: String? = "en-US",
    )
}
