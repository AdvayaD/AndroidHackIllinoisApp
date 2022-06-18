package com.example.apitest

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("profile/leaderboard/")
    fun getLeaderboard(): Call<PostModel>
}