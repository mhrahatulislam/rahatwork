package com.example.projectclicnt

import com.example.projectclicnt.model.Responses
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetroService {
    @GET("product/v2")
    fun getProducts(
        @Query("productType") productType: String,
        @Query("isDeleted") isDeleted: Boolean,
        @Query("minimumStock") minimumStock: Long,
        @Query("sortBy") sortBy: String,
        @Query("sortOrder") sortOrder: String,
        @Query("page") page: Int,
        @Query("limit") limit: Int
    ): Call<Responses>

}