package com.example.example

import com.google.gson.annotations.SerializedName


data class Auction (

  @SerializedName("auctionId"              ) var auctionId              : String?   = null,
  @SerializedName("startingPrice"          ) var startingPrice          : Int?      = null,
  @SerializedName("currentPrice"           ) var currentPrice           : Int?      = null,
  @SerializedName("minimumIncrementAmount" ) var minimumIncrementAmount : Int?      = null,
  @SerializedName("nextBidPrice"           ) var nextBidPrice           : Int?      = null,
  @SerializedName("auctionType"            ) var auctionType            : String?   = null,
  @SerializedName("isSealed"               ) var isSealed               : Boolean?  = null,
  @SerializedName("isBuyNowEnable"         ) var isBuyNowEnable         : Boolean?  = null,
  @SerializedName("hasEnded"               ) var hasEnded               : Boolean?  = null,
  @SerializedName("customer"               ) var customer               : Customer? = Customer(),
  @SerializedName("startDate"              ) var startDate              : String?   = null,
  @SerializedName("endDate"                ) var endDate                : String?   = null,
  @SerializedName("lastBiddingId"          ) var lastBiddingId          : String?   = null,
  @SerializedName("isExceedReservePrice"   ) var isExceedReservePrice   : Boolean?  = null

)