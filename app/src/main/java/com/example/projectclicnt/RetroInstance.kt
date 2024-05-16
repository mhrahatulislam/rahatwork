package com.example.projectclicnt

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetroInstance {private val logging = HttpLoggingInterceptor().apply {
    level = HttpLoggingInterceptor.Level.BODY
}

    private val client = OkHttpClient.Builder()
        .addInterceptor(logging)
        .build()

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://catalog-reader.ejachai.com/api/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()

    val retroService: RetroService = retrofit.create(RetroService::class.java)
}
