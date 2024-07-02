package com.example.apusing.Model

import com.google.gson.annotations.SerializedName

data class GroupBuy(
    @SerializedName("lastPaymentTimeInMinute") var lastPaymentTimeInMinute: Long?= null,
    @SerializedName("totalParticipator") var totalParticipator: Any? = null,
    @SerializedName("noOfParticipatorEachGroup") var noOfParticipatorEachGroup: Long?= null,
    @SerializedName("isPayFirst") var isPayFirst: Boolean? = null
)
