package com.example.example

import com.google.gson.annotations.SerializedName


data class ResponceData (

  @SerializedName("message"           ) var message           : String?             = null,
  @SerializedName("statusCode"        ) var statusCode        : Int?                = null,
  @SerializedName("first"             ) var first             : Boolean?            = null,
  @SerializedName("last"              ) var last              : Boolean?            = null,
  @SerializedName("totalPages"        ) var totalPages        : Int?                = null,
  @SerializedName("totalElements"     ) var totalElements     : Int?                = null,
  @SerializedName("numberOfElements"  ) var numberOfElements  : Int?                = null,
  @SerializedName("currentPageNumber" ) var currentPageNumber : Int?                = null,
  @SerializedName("products"          ) var products          : ArrayList<Products> = arrayListOf()

)