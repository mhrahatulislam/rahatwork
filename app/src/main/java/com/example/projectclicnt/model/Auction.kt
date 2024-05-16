package com.example.projectclicnt.model

data class Auction(
    val auctionId: String,
    val auctionType: String,
    val currentPrice: Int,
    val customer: Customer,
    val endDate: String,
    val hasEnded: Boolean,
    val isBuyNowEnable: Boolean,
    val isExceedReservePrice: Boolean,
    val isSealed: Boolean,
    val lastBiddingId: String,
    val minimumIncrementAmount: Int,
    val nextBidPrice: Int,
    val startDate: String,
    val startingPrice: Int
)