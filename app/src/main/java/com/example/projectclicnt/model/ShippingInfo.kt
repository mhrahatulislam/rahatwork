package com.example.example

import com.google.gson.annotations.SerializedName


data class ShippingInfo (

  @SerializedName("weight"                ) var weight                : Double?    = null,
  @SerializedName("unit"                  ) var unit                  : String?    = null,
  @SerializedName("dimension"             ) var dimension             : Dimension? = Dimension(),
  @SerializedName("allowFreeShipping"     ) var allowFreeShipping     : Boolean?   = null,
  @SerializedName("allowPriorityDelivery" ) var allowPriorityDelivery : Boolean?   = null,
  @SerializedName("allowStandardDelivery" ) var allowStandardDelivery : Boolean?   = null,
  @SerializedName("allowEconomyDelivery"  ) var allowEconomyDelivery  : Boolean?   = null,
  @SerializedName("allowScheduleDelivery" ) var allowScheduleDelivery : Boolean?   = null

)