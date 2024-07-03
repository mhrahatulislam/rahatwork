package com.example.projectclicnt.Model.GetData

import com.google.gson.annotations.SerializedName


data class Breadcrumbs (

  @SerializedName("title" ) var title : String? = null,
  @SerializedName("slug"  ) var slug  : String? = null,
  @SerializedName("id"    ) var id    : String? = null,
  @SerializedName("type"  ) var type  : String? = null

)