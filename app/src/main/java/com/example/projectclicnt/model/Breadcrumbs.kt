package com.example.example

import com.google.gson.annotations.SerializedName


data class Breadcrumbs (

  @SerializedName("title" ) var title : String? = null,
  @SerializedName("slug"  ) var slug  : String? = null,
  @SerializedName("id"    ) var id    : String? = null,
  @SerializedName("type"  ) var type  : String? = null

)