package com.example.example

import com.google.gson.annotations.SerializedName


data class Childs (

  @SerializedName("title" ) var title : String? = null,
  @SerializedName("slug"  ) var slug  : String? = null

)