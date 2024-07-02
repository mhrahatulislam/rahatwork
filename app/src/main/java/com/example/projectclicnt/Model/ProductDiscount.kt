package com.example.example

import com.google.gson.annotations.SerializedName


data class ProductDiscount (

  @SerializedName("flat"       ) var flat       : Int? = null,
  @SerializedName("percentage" ) var percentage : Int? = null

)