package com.example.projectclicnt.model

data class Price(
    val currencyCode: String,
    val discountedPrice: Int,
    val giftCardValue: Any,
    val mrp: Int,
    val resellerTp: Any,
    val sellerDiscountedPrice: Int,
    val tp: Int
)