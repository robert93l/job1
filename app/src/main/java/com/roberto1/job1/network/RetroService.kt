package com.roberto1.job1.network

import com.roberto1.job1.models.RecyclerList
import retrofit2.http.GET
import retrofit2.http.Query

interface RetroService {

    @GET("repositories")  //cambiar por universities no se si esta correcto
    suspend fun getDataFromApi(@Query("q") query : String): RecyclerList

}