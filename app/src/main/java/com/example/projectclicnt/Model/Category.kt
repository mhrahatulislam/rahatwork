package com.example.example

import com.google.gson.annotations.SerializedName


data class Category (

  @SerializedName("id"                   ) var id                   : String?    = null,
  @SerializedName("type"                 ) var type                 : String?    = null,
  @SerializedName("title"                ) var title                : String?    = null,
  @SerializedName("slug"                 ) var slug                 : String?    = null,
  @SerializedName("keyword"              ) var keyword              : String?    = null,
  @SerializedName("image"                ) var image                : String?    = null,
  @SerializedName("immediateParentTitle" ) var immediateParentTitle : String?    = null,
  @SerializedName("parentOfParentTitle"  ) var parentOfParentTitle  : String?    = null,
  @SerializedName("parent"               ) var parent               : String?    = null,
  @SerializedName("level"                ) var level                : Int?       = null,
  @SerializedName("description"          ) var description          : String?    = null,
  @SerializedName("position"             ) var position             : Int?       = null,
  @SerializedName("status"               ) var status               : String?    = null,
  @SerializedName("deleted"              ) var deleted              : Boolean?   = null,
  @SerializedName("bannerImage"          ) var bannerImage          : String?    = null,
  @SerializedName("createdAt"            ) var createdAt            : String?    = null,
  @SerializedName("createdBy"            ) var createdBy            : CreatedBy? = CreatedBy(),
  @SerializedName("updatedAt"            ) var updatedAt            : String?    = null,
  @SerializedName("updatedBy"            ) var updatedBy            : UpdatedBy? = UpdatedBy(),
  @SerializedName("rootParentCategoryId" ) var rootParentCategoryId : String?    = null,
  @SerializedName("numberOfProducts"     ) var numberOfProducts     : String?    = null,
  @SerializedName("metaTitle"            ) var metaTitle            : String?    = null,
  @SerializedName("metaDescription"      ) var metaDescription      : String?    = null,
  @SerializedName("childs"               ) var childs               : String?    = null

)