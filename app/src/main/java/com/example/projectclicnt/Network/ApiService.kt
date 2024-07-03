package com.example.projectclicnt.Network

import com.example.projectclicnt.Model.GetData.ResponceData
import com.example.projectclicnt.Model.PostModel.BidRequest
import com.example.projectclicnt.Model.PostModel.BidResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiService {
    @GET("product/v2")
    fun getProductData(
        @Query("productType") productType: String,
        @Query("isDeleted") isDeleted: Boolean,
        @Query("minimumStock") minimumStock: Long,
        @Query("sortBy") sortBy: String,
        @Query("sortOrder") sortOrder: String,
        @Query("page") page: Int,
        @Query("limit") limit: Int
    ): Call<ResponceData>

    @POST("/api/v1/auction/bid")
    fun placeBid(
        @Header("Authorization") token: String,
        @Body bidRequest: BidRequest
    ): Call<BidResponse>

}