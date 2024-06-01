package com.example.example

import com.google.gson.annotations.SerializedName


data class ResponceData (

  @SerializedName("message"    ) var message    : String?  = null,
  @SerializedName("statusCode" ) var statusCode : Int?     = null,
  @SerializedName("product"    ) var product    : Product? = Product()

)