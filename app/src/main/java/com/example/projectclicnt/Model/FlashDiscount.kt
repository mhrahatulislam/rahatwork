package com.example.apusing.Model

import com.google.gson.annotations.SerializedName

data class FlashDiscount(
    @SerializedName("discountType") var discountType: String? = null,
    @SerializedName("discountAmount") var discountAmount: Double? = null,
    @SerializedName("expireDate") var expireDate: String? = null
)
