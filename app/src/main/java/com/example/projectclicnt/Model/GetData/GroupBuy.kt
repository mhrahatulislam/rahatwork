package com.example.projectclicnt.Model.GetData

import com.google.gson.annotations.SerializedName


data class GroupBuy (

  @SerializedName("lastPaymentTimeInMinute"   ) var lastPaymentTimeInMinute   : Int?     = null,
  @SerializedName("totalParticipator"         ) var totalParticipator         : String?  = null,
  @SerializedName("noOfParticipatorEachGroup" ) var noOfParticipatorEachGroup : Int?     = null,
  @SerializedName("isPayFirst"                ) var isPayFirst                : Boolean? = null

)