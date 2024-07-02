package com.example.example

import com.google.gson.annotations.SerializedName


data class Location (

  @SerializedName("x"           ) var x           : Double?           = null,
  @SerializedName("y"           ) var y           : Double?           = null,
  @SerializedName("coordinates" ) var coordinates : ArrayList<Double> = arrayListOf(),
  @SerializedName("type"        ) var type        : String?           = null

)