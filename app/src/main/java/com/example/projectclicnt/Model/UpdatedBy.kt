package com.example.example

import com.google.gson.annotations.SerializedName


data class UpdatedBy (

  @SerializedName("id"             ) var id             : String? = null,
  @SerializedName("mobileNumber"   ) var mobileNumber   : String? = null,
  @SerializedName("name"           ) var name           : String? = null,
  @SerializedName("type"           ) var type           : String? = null,
  @SerializedName("profilePicture" ) var profilePicture : String? = null,
  @SerializedName("email"          ) var email          : String? = null,
  @SerializedName("isNewUser"      ) var isNewUser      : String? = null

)