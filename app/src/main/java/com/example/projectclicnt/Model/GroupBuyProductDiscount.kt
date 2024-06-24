package com.example.example

import com.google.gson.annotations.SerializedName


data class GroupBuyProductDiscount (

  @SerializedName("flat"       ) var flat       : String? = null,
  @SerializedName("percentage" ) var percentage : String? = null

)