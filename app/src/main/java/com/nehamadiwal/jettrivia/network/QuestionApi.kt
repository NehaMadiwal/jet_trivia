package com.nehamadiwal.jettrivia.network

import com.nehamadiwal.jettrivia.model.Question
import retrofit2.http.GET
import javax.inject.Singleton


@Singleton
interface QuestionApi {

    @GET("world.json")
    suspend fun getAllQuestions(): Question

}