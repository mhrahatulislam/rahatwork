package com.example.example

import com.google.gson.annotations.SerializedName


data class Dimension (

  @SerializedName("length" ) var length : Int?    = null,
  @SerializedName("height" ) var height : Int?    = null,
  @SerializedName("width"  ) var width  : Int?    = null,
  @SerializedName("unit"   ) var unit   : String? = null

)