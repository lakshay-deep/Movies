package com.lakshay.movies.domain.repository

import com.lakshay.movies.domain.model.Movie

internal interface MovieRepository {

    suspend fun getMovies(page: Int): List<Movie>

    suspend fun getMovie(movieId: Int): Movie
}