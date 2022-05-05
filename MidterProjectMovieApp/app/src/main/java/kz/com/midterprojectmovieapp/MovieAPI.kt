package kz.com.midtermproject

import retrofit2.Call
import kz.com.midtermproject.MovieResponse
import retrofit2.http.GET


interface MovieAPI {
    @GET("/3/movie/popular?api_key=bbf5a3000e95f1dddf266b5e187d4b21")
    fun getMovieList(): Call<MovieResponse>
}