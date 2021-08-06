package com.roberto1.job1.network
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RetroInstance {

    companion object {
        val BaseURL = "https://api.github.com/search/"   ///cambiar para ejemplo


        fun getRetroInstance(): Retrofit{
           return Retrofit.Builder().baseUrl(BaseURL).addConverterFactory(GsonConverterFactory.create()).build()
        }
    }
}