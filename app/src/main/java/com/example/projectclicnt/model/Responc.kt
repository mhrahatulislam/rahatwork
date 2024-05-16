package com.example.projectclicnt.model

data class Responc(
    val currentPageNumber: Int,
    val first: Boolean,
    val last: Boolean,
    val message: String,
    val numberOfElements: Int,
    val products: List<Product>,
    val statusCode: Int,
    val totalElements: Int,
    val totalPages: Int
)