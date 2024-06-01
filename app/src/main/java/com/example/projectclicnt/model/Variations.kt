package com.example.example

import com.google.gson.annotations.SerializedName


data class Variations (

  @SerializedName("variationId"                 ) var variationId                 : String? = null,
  @SerializedName("variationName"               ) var variationName               : String? = null,
  @SerializedName("productDiscount"             ) var productDiscount             : String? = null,
  @SerializedName("groupBuyProductDiscount"     ) var groupBuyProductDiscount     : String? = null,
  @SerializedName("quantitativeProductDiscount" ) var quantitativeProductDiscount : String? = null,
  @SerializedName("stock"                       ) var stock                       : Int?    = null,
  @SerializedName("price"                       ) var price                       : Price?  = Price(),
  @SerializedName("groupBuyPrice"               ) var groupBuyPrice               : String? = null,
  @SerializedName("imageUrl"                    ) var imageUrl                    : String? = null,
  @SerializedName("maximumOrderLimit"           ) var maximumOrderLimit           : String? = null,
  @SerializedName("regularVariationId"          ) var regularVariationId          : String? = null,
  @SerializedName("barCode"                     ) var barCode                     : String? = null,
  @SerializedName("subsidyType"                 ) var subsidyType                 : String? = null,
  @SerializedName("subsidyAmount"               ) var subsidyAmount               : String? = null,
  @SerializedName("pointAmount"                 ) var pointAmount                 : Int?    = null,
  @SerializedName("sellerPurchasePrice"         ) var sellerPurchasePrice         : String? = null,
  @SerializedName("specialTpDiscount"           ) var specialTpDiscount           : String? = null,
  @SerializedName("specialDiscountPrice"        ) var specialDiscountPrice        : String? = null,
  @SerializedName("sellerProfit"                ) var sellerProfit                : String? = null,
  @SerializedName("platformProfit"              ) var platformProfit              : String? = null,
  @SerializedName("maxOrderQuantity"            ) var maxOrderQuantity            : String? = null,
  @SerializedName("jsinnumber"                  ) var jsinnumber                  : String? = null

)