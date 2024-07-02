package com.example.projectclicnt.Network

import com.example.example.ResponceData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("product/v2")
    fun getProductData(
        @Query("isDeleted") isDeleted: Boolean,
        @Query("minimumStock") minimumStock: Long,
        @Query("sortBy") sortBy: String,
        @Query("sortOrder") sortOrder: String,
        @Query("page") page: Int,
        @Query("limit") limit: Int
    ): Call<ResponceData>
}