package com.example.example

import com.google.gson.annotations.SerializedName


data class Price (

  @SerializedName("mrp"                   ) var mrp                   : Int?    = null,
  @SerializedName("tp"                    ) var tp                    : Double?    = null,
  @SerializedName("resellerTp"            ) var resellerTp            : String? = null,
  @SerializedName("sellerDiscountedPrice" ) var sellerDiscountedPrice : Int?    = null,
  @SerializedName("currencyCode"          ) var currencyCode          : String? = null,
  @SerializedName("discountedPrice"       ) var discountedPrice       : Int?    = null,
  @SerializedName("giftCardValue"         ) var giftCardValue         : String? = null

)