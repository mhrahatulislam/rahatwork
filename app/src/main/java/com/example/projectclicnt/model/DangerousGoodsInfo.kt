package com.example.example

import com.google.gson.annotations.SerializedName


data class DangerousGoodsInfo (

  @SerializedName("isBattery"     ) var isBattery     : Boolean? = null,
  @SerializedName("isFlammable"   ) var isFlammable   : Boolean? = null,
  @SerializedName("isLiquid"      ) var isLiquid      : Boolean? = null,
  @SerializedName("safetyWarning" ) var safetyWarning : String?  = null

)