package com.example.projectclicnt.Model.GetData

import com.google.gson.annotations.SerializedName


data class Campaign (

    @SerializedName("id"                            ) var id                            : String?   = null,
    @SerializedName("banner"                        ) var banner                        : String?   = null,
    @SerializedName("description"                   ) var description                   : String?   = null,
    @SerializedName("campaignType"                  ) var campaignType                  : String?   = null,
    @SerializedName("name"                          ) var name                          : String?   = null,
    @SerializedName("slug"                          ) var slug                          : String?   = null,
    @SerializedName("isActive"                      ) var isActive                      : Boolean?  = null,
    @SerializedName("type"                          ) var type                          : String?   = null,
    @SerializedName("startAt"                       ) var startAt                       : String?   = null,
    @SerializedName("endAt"                         ) var endAt                         : String?   = null,
    @SerializedName("displayOrder"                  ) var displayOrder                  : Int?      = null,
    @SerializedName("parentCampaign"                ) var parentCampaign                : String?   = null,
    @SerializedName("colorCode"                     ) var colorCode                     : String?   = null,
    @SerializedName("shopId"                        ) var shopId                        : String?   = null,
    @SerializedName("deleted"                       ) var deleted                       : Boolean?  = null,
    @SerializedName("bannerWeb"                     ) var bannerWeb                     : String?   = null,
    @SerializedName("isFlashSale"                   ) var isFlashSale                   : Boolean?  = null,
    @SerializedName("minimumDiscountType"           ) var minimumDiscountType           : String?   = null,
    @SerializedName("minimumDiscount"               ) var minimumDiscount               : String?   = null,
    @SerializedName("merchantOfferedDiscountType"   ) var merchantOfferedDiscountType   : String?   = null,
    @SerializedName("merchantOfferedDiscount"       ) var merchantOfferedDiscount       : String?   = null,
    @SerializedName("campaignFor"                   ) var campaignFor                   : String?   = null,
    @SerializedName("thumbnail"                     ) var thumbnail                     : String?   = null,
    @SerializedName("termAndConditions"             ) var termAndConditions             : String?   = null,
    @SerializedName("products"                      ) var products                      : String?   = null,
    @SerializedName("numberOfProducts"              ) var numberOfProducts              : String?   = null,
    @SerializedName("metaTitle"                     ) var metaTitle                     : String?   = null,
    @SerializedName("metaDescription"               ) var metaDescription               : String?   = null,
    @SerializedName("keyword"                       ) var keyword                       : String?   = null,
    @SerializedName("groupBuy"                      ) var groupBuy                      : GroupBuy? = GroupBuy(),
    @SerializedName("totalOrders"                   ) var totalOrders                   : String?   = null,
    @SerializedName("createdAt"                     ) var createdAt                     : String?   = null,
    @SerializedName("promoExpiredInDays"            ) var promoExpiredInDays            : String?   = null,
    @SerializedName("promoCode"                     ) var promoCode                     : String?   = null,
    @SerializedName("faqs"                          ) var faqs                          : String?   = null,
    @SerializedName("campaignMaximumDiscountAmount" ) var campaignMaximumDiscountAmount : String?   = null,
    @SerializedName("campaignOrdersOverAmount"      ) var campaignOrdersOverAmount      : String?   = null

)