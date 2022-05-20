package com.cursokotlin.mvvmexample.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
//url de la base de datos
object RetrofitHelper {
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://drawsomething-59328-default-rtdb.europe-west1.firebasedatabase.app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}