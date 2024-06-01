package com.example.example

import com.google.gson.annotations.SerializedName


data class NameWithLanguages (

  @SerializedName("languageCode" ) var languageCode : String? = null,
  @SerializedName("name"         ) var name         : String? = null

)