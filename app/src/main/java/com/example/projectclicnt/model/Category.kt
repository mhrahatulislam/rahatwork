package com.example.projectclicnt.model

data class Category(
    val bannerImage: String,
    val childs: List<Any>,
    val createdAt: String,
    val createdBy: CreatedByX,
    val deleted: Boolean,
    val description: String,
    val id: String,
    val image: String,
    val immediateParentTitle: Any,
    val keyword: String,
    val level: Int,
    val metaDescription: Any,
    val metaTitle: Any,
    val numberOfProducts: Any,
    val parent: String,
    val parentOfParentTitle: Any,
    val position: Int,
    val rootParentCategoryId: String,
    val slug: String,
    val status: Any,
    val title: String,
    val type: String,
    val updatedAt: String,
    val updatedBy: UpdatedByXX
)