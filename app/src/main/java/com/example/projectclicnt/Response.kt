package com.example.projectclicnt

import com.google.gson.annotations.SerializedName

data class Response(

	@field:SerializedName("product")
	val product: Product? = null,

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("statusCode")
	val statusCode: Int? = null
)

data class BreadcrumbsItem(

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("slug")
	val slug: String? = null
)

data class Auction(

	@field:SerializedName("isSealed")
	val isSealed: Boolean? = null,

	@field:SerializedName("nextBidPrice")
	val nextBidPrice: Int? = null,

	@field:SerializedName("isBuyNowEnable")
	val isBuyNowEnable: Boolean? = null,

	@field:SerializedName("endDate")
	val endDate: String? = null,

	@field:SerializedName("lastBiddingId")
	val lastBiddingId: String? = null,

	@field:SerializedName("currentPrice")
	val currentPrice: Int? = null,

	@field:SerializedName("startingPrice")
	val startingPrice: Int? = null,

	@field:SerializedName("isExceedReservePrice")
	val isExceedReservePrice: Boolean? = null,

	@field:SerializedName("auctionId")
	val auctionId: String? = null,

	@field:SerializedName("hasEnded")
	val hasEnded: Boolean? = null,

	@field:SerializedName("minimumIncrementAmount")
	val minimumIncrementAmount: Int? = null,

	@field:SerializedName("auctionType")
	val auctionType: String? = null,

	@field:SerializedName("startDate")
	val startDate: String? = null,

	@field:SerializedName("customer")
	val customer: Customer? = null
)

data class NameWithLanguagesItem(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("languageCode")
	val languageCode: String? = null
)

data class Category(

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("parent")
	val parent: String? = null,

	@field:SerializedName("level")
	val level: Int? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("rootParentCategoryId")
	val rootParentCategoryId: String? = null,

	@field:SerializedName("metaDescription")
	val metaDescription: Any? = null,

	@field:SerializedName("childs")
	val childs: List<Any?>? = null,

	@field:SerializedName("commissionType")
	val commissionType: Any? = null,

	@field:SerializedName("bannerImage")
	val bannerImage: String? = null,

	@field:SerializedName("createdAt")
	val createdAt: String? = null,

	@field:SerializedName("deleted")
	val deleted: Boolean? = null,

	@field:SerializedName("metaTitle")
	val metaTitle: Any? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("position")
	val position: Int? = null,

	@field:SerializedName("keyword")
	val keyword: String? = null,

	@field:SerializedName("slug")
	val slug: String? = null,

	@field:SerializedName("status")
	val status: Any? = null,

	@field:SerializedName("commissionAmount")
	val commissionAmount: Any? = null,

	@field:SerializedName("updatedAt")
	val updatedAt: String? = null
)

data class DangerousGoodsInfo(

	@field:SerializedName("isBattery")
	val isBattery: Boolean? = null,

	@field:SerializedName("isFlammable")
	val isFlammable: Boolean? = null,

	@field:SerializedName("isLiquid")
	val isLiquid: Boolean? = null,

	@field:SerializedName("safetyWarning")
	val safetyWarning: Any? = null
)

data class Product(

	@field:SerializedName("hubId")
	val hubId: Any? = null,

	@field:SerializedName("productSource")
	val productSource: Any? = null,

	@field:SerializedName("voucherAmount")
	val voucherAmount: Any? = null,

	@field:SerializedName("globalProductId")
	val globalProductId: Any? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("updatedLogs")
	val updatedLogs: Any? = null,

	@field:SerializedName("issues")
	val issues: Any? = null,

	@field:SerializedName("productCondition")
	val productCondition: String? = null,

	@field:SerializedName("urlCustomize")
	val urlCustomize: Any? = null,

	@field:SerializedName("previousIsActive")
	val previousIsActive: Boolean? = null,

	@field:SerializedName("bookingEnabled")
	val bookingEnabled: Boolean? = null,

	@field:SerializedName("supplier")
	val supplier: Any? = null,

	@field:SerializedName("faq")
	val faq: Any? = null,

	@field:SerializedName("imageDescription")
	val imageDescription: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("sku")
	val sku: String? = null,

	@field:SerializedName("isPreOrder")
	val isPreOrder: Any? = null,

	@field:SerializedName("brand")
	val brand: Any? = null,

	@field:SerializedName("images")
	val images: List<String?>? = null,

	@field:SerializedName("campaignId")
	val campaignId: Any? = null,

	@field:SerializedName("addOns")
	val addOns: Any? = null,

	@field:SerializedName("vat")
	val vat: Any? = null,

	@field:SerializedName("merchant")
	val merchant: Any? = null,

	@field:SerializedName("brandId")
	val brandId: Any? = null,

	@field:SerializedName("canonicalTag")
	val canonicalTag: Any? = null,

	@field:SerializedName("shippingZoneIds")
	val shippingZoneIds: Any? = null,

	@field:SerializedName("numberOfRating")
	val numberOfRating: Int? = null,

	@field:SerializedName("profitSharePercentageForPoint")
	val profitSharePercentageForPoint: Int? = null,

	@field:SerializedName("warrantyType")
	val warrantyType: Any? = null,

	@field:SerializedName("breadcrumbs")
	val breadcrumbs: List<BreadcrumbsItem?>? = null,

	@field:SerializedName("status")
	val status: String? = null,

	@field:SerializedName("commissionAmount")
	val commissionAmount: Any? = null,

	@field:SerializedName("campaignVariations")
	val campaignVariations: Any? = null,

	@field:SerializedName("handlingTimeTo")
	val handlingTimeTo: Any? = null,

	@field:SerializedName("shippingInfo")
	val shippingInfo: ShippingInfo? = null,

	@field:SerializedName("manufacturerContactInfo")
	val manufacturerContactInfo: Any? = null,

	@field:SerializedName("rootParentCategory")
	val rootParentCategory: RootParentCategory? = null,

	@field:SerializedName("variations")
	val variations: List<VariationsItem?>? = null,

	@field:SerializedName("expireDate")
	val expireDate: Any? = null,

	@field:SerializedName("isForCheckOut")
	val isForCheckOut: Boolean? = null,

	@field:SerializedName("noOfParticipatorEachGroup")
	val noOfParticipatorEachGroup: Any? = null,

	@field:SerializedName("productVideoUrl")
	val productVideoUrl: String? = null,

	@field:SerializedName("accessories")
	val accessories: Any? = null,

	@field:SerializedName("rootParentCategoryId")
	val rootParentCategoryId: String? = null,

	@field:SerializedName("commissionType")
	val commissionType: Any? = null,

	@field:SerializedName("isReturnable")
	val isReturnable: Any? = null,

	@field:SerializedName("deleted")
	val deleted: Boolean? = null,

	@field:SerializedName("imageAltrText")
	val imageAltrText: Any? = null,

	@field:SerializedName("productCode")
	val productCode: Any? = null,

	@field:SerializedName("additionalProducts")
	val additionalProducts: Any? = null,

	@field:SerializedName("returnRefundPolicy")
	val returnRefundPolicy: Any? = null,

	@field:SerializedName("salesCount")
	val salesCount: Int? = null,

	@field:SerializedName("groupBuyTotalParticipants")
	val groupBuyTotalParticipants: Any? = null,

	@field:SerializedName("manufacturerName")
	val manufacturerName: Any? = null,

	@field:SerializedName("rating")
	val rating: Int? = null,

	@field:SerializedName("approvedBy")
	val approvedBy: Any? = null,

	@field:SerializedName("deliveryCharge")
	val deliveryCharge: Any? = null,

	@field:SerializedName("source")
	val source: Any? = null,

	@field:SerializedName("isActive")
	val isActive: Boolean? = null,

	@field:SerializedName("metaDescription")
	val metaDescription: Any? = null,

	@field:SerializedName("termsCondition")
	val termsCondition: Any? = null,

	@field:SerializedName("productImage")
	val productImage: String? = null,

	@field:SerializedName("imageCaption")
	val imageCaption: Any? = null,

	@field:SerializedName("reviews")
	val reviews: Any? = null,

	@field:SerializedName("excludeFromPromo")
	val excludeFromPromo: Any? = null,

	@field:SerializedName("merchantId")
	val merchantId: Any? = null,

	@field:SerializedName("iswrapAvailable")
	val iswrapAvailable: Any? = null,

	@field:SerializedName("shopId")
	val shopId: String? = null,

	@field:SerializedName("keyword")
	val keyword: String? = null,

	@field:SerializedName("stock")
	val stock: Int? = null,

	@field:SerializedName("slug")
	val slug: String? = null,

	@field:SerializedName("serviceFee")
	val serviceFee: Int? = null,

	@field:SerializedName("shippingTypes")
	val shippingTypes: Any? = null,

	@field:SerializedName("updatedBy")
	val updatedBy: UpdatedBy? = null,

	@field:SerializedName("excludeCOD")
	val excludeCOD: Any? = null,

	@field:SerializedName("handlingTimeFrom")
	val handlingTimeFrom: Any? = null,

	@field:SerializedName("tax")
	val tax: Any? = null,

	@field:SerializedName("shortDescription")
	val shortDescription: Any? = null,

	@field:SerializedName("priceCalculationType")
	val priceCalculationType: Any? = null,

	@field:SerializedName("barCode")
	val barCode: String? = null,

	@field:SerializedName("visitors")
	val visitors: Int? = null,

	@field:SerializedName("merchantProductId")
	val merchantProductId: Any? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("campaign")
	val campaign: Any? = null,

	@field:SerializedName("isPopular")
	val isPopular: Any? = null,

	@field:SerializedName("shop")
	val shop: Shop? = null,

	@field:SerializedName("supplierId")
	val supplierId: Any? = null,

	@field:SerializedName("dangerousGoodsInfo")
	val dangerousGoodsInfo: DangerousGoodsInfo? = null,

	@field:SerializedName("displayOrder")
	val displayOrder: Int? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("productOrigin")
	val productOrigin: String? = null,

	@field:SerializedName("auction")
	val auction: Auction? = null,

	@field:SerializedName("nameWithLanguages")
	val nameWithLanguages: List<NameWithLanguagesItem?>? = null,

	@field:SerializedName("warrantyPolicy")
	val warrantyPolicy: Any? = null,

	@field:SerializedName("manufactureDate")
	val manufactureDate: Any? = null,

	@field:SerializedName("imageTitle")
	val imageTitle: String? = null,

	@field:SerializedName("startAt")
	val startAt: Any? = null,

	@field:SerializedName("productType")
	val productType: String? = null,

	@field:SerializedName("isAllowWarranty")
	val isAllowWarranty: Boolean? = null,

	@field:SerializedName("isResellerProduct")
	val isResellerProduct: Any? = null,

	@field:SerializedName("groupBuyTotalGroups")
	val groupBuyTotalGroups: Any? = null,

	@field:SerializedName("returnRefundTimeInMonth")
	val returnRefundTimeInMonth: Any? = null,

	@field:SerializedName("specification")
	val specification: Any? = null,

	@field:SerializedName("isFreeDelivery")
	val isFreeDelivery: Any? = null,

	@field:SerializedName("deliveryProfileId")
	val deliveryProfileId: Any? = null,

	@field:SerializedName("paymentTimeInSeconds")
	val paymentTimeInSeconds: Any? = null,

	@field:SerializedName("isResellAllowed")
	val isResellAllowed: Boolean? = null,

	@field:SerializedName("hub")
	val hub: Any? = null,

	@field:SerializedName("createdBy")
	val createdBy: CreatedBy? = null,

	@field:SerializedName("prePaidAmountInPercentage")
	val prePaidAmountInPercentage: Any? = null,

	@field:SerializedName("metaTitle")
	val metaTitle: Any? = null,

	@field:SerializedName("giftCard")
	val giftCard: Any? = null,

	@field:SerializedName("warrantyTimeInMonth")
	val warrantyTimeInMonth: Any? = null,

	@field:SerializedName("location")
	val location: Location? = null,

	@field:SerializedName("category")
	val category: Category? = null,

	@field:SerializedName("isRequested")
	val isRequested: Any? = null,

	@field:SerializedName("categoryId")
	val categoryId: String? = null
)

data class RootParentCategory(

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("parent")
	val parent: Any? = null,

	@field:SerializedName("level")
	val level: Int? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("rootParentCategoryId")
	val rootParentCategoryId: String? = null,

	@field:SerializedName("metaDescription")
	val metaDescription: Any? = null,

	@field:SerializedName("childs")
	val childs: List<ChildsItem?>? = null,

	@field:SerializedName("commissionType")
	val commissionType: Any? = null,

	@field:SerializedName("bannerImage")
	val bannerImage: String? = null,

	@field:SerializedName("createdAt")
	val createdAt: String? = null,

	@field:SerializedName("deleted")
	val deleted: Boolean? = null,

	@field:SerializedName("metaTitle")
	val metaTitle: Any? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("position")
	val position: Int? = null,

	@field:SerializedName("keyword")
	val keyword: String? = null,

	@field:SerializedName("slug")
	val slug: String? = null,

	@field:SerializedName("status")
	val status: Any? = null,

	@field:SerializedName("commissionAmount")
	val commissionAmount: Any? = null,

	@field:SerializedName("updatedAt")
	val updatedAt: String? = null
)

data class Location(

	@field:SerializedName("x")
	val x: Any? = null,

	@field:SerializedName("coordinates")
	val coordinates: List<Any?>? = null,

	@field:SerializedName("y")
	val y: Any? = null,

	@field:SerializedName("type")
	val type: String? = null
)

data class Dimension(

	@field:SerializedName("unit")
	val unit: String? = null,

	@field:SerializedName("length")
	val length: Int? = null,

	@field:SerializedName("width")
	val width: Int? = null,

	@field:SerializedName("height")
	val height: Int? = null
)

data class UpdatedBy(

	@field:SerializedName("profilePicture")
	val profilePicture: String? = null,

	@field:SerializedName("mobileNumber")
	val mobileNumber: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("isNewUser")
	val isNewUser: Any? = null,

	@field:SerializedName("email")
	val email: Any? = null
)

data class VariationsItem(

	@field:SerializedName("pointAmount")
	val pointAmount: Int? = null,

	@field:SerializedName("groupBuyProductDiscount")
	val groupBuyProductDiscount: Any? = null,

	@field:SerializedName("specialDiscountPrice")
	val specialDiscountPrice: Any? = null,

	@field:SerializedName("sellerPurchasePrice")
	val sellerPurchasePrice: Any? = null,

	@field:SerializedName("subsidyAmount")
	val subsidyAmount: Any? = null,

	@field:SerializedName("platformProfit")
	val platformProfit: Any? = null,

	@field:SerializedName("barCode")
	val barCode: String? = null,

	@field:SerializedName("subsidyType")
	val subsidyType: Any? = null,

	@field:SerializedName("variationId")
	val variationId: String? = null,

	@field:SerializedName("variationName")
	val variationName: Any? = null,

	@field:SerializedName("price")
	val price: Price? = null,

	@field:SerializedName("maximumOrderLimit")
	val maximumOrderLimit: Any? = null,

	@field:SerializedName("imageUrl")
	val imageUrl: Any? = null,

	@field:SerializedName("productDiscount")
	val productDiscount: Any? = null,

	@field:SerializedName("groupBuyPrice")
	val groupBuyPrice: Any? = null,

	@field:SerializedName("stock")
	val stock: Int? = null,

	@field:SerializedName("specialTpDiscount")
	val specialTpDiscount: Any? = null,

	@field:SerializedName("regularVariationId")
	val regularVariationId: Any? = null,

	@field:SerializedName("sellerProfit")
	val sellerProfit: Any? = null,

	@field:SerializedName("maxOrderQuantity")
	val maxOrderQuantity: Any? = null,

	@field:SerializedName("quantitativeProductDiscount")
	val quantitativeProductDiscount: Any? = null,

	@field:SerializedName("jsinnumber")
	val jsinnumber: String? = null
)

data class Price(

	@field:SerializedName("resellerTp")
	val resellerTp: Any? = null,

	@field:SerializedName("discountedPrice")
	val discountedPrice: Int? = null,

	@field:SerializedName("mrp")
	val mrp: Int? = null,

	@field:SerializedName("giftCardValue")
	val giftCardValue: Any? = null,

	@field:SerializedName("tp")
	val tp: Int? = null,

	@field:SerializedName("currencyCode")
	val currencyCode: String? = null,

	@field:SerializedName("sellerDiscountedPrice")
	val sellerDiscountedPrice: Int? = null
)

data class CreatedBy(

	@field:SerializedName("profilePicture")
	val profilePicture: String? = null,

	@field:SerializedName("mobileNumber")
	val mobileNumber: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("isNewUser")
	val isNewUser: Any? = null,

	@field:SerializedName("email")
	val email: Any? = null
)

data class Shop(

	@field:SerializedName("hubId")
	val hubId: Any? = null,

	@field:SerializedName("country")
	val country: String? = null,

	@field:SerializedName("keywords")
	val keywords: String? = null,

	@field:SerializedName("subsidy")
	val subsidy: Any? = null,

	@field:SerializedName("mobileNumber")
	val mobileNumber: String? = null,

	@field:SerializedName("rating")
	val rating: Int? = null,

	@field:SerializedName("pickUp")
	val pickUp: Any? = null,

	@field:SerializedName("deliveryCharge")
	val deliveryCharge: Any? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("ownerId")
	val ownerId: String? = null,

	@field:SerializedName("isActive")
	val isActive: Boolean? = null,

	@field:SerializedName("metaDescription")
	val metaDescription: Any? = null,

	@field:SerializedName("deliveryPackagingFullFillType")
	val deliveryPackagingFullFillType: Any? = null,

	@field:SerializedName("createdAt")
	val createdAt: String? = null,

	@field:SerializedName("merchantBusinessAndContactInfo")
	val merchantBusinessAndContactInfo: Any? = null,

	@field:SerializedName("balance")
	val balance: Any? = null,

	@field:SerializedName("merchantId")
	val merchantId: String? = null,

	@field:SerializedName("logo")
	val logo: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("slug")
	val slug: String? = null,

	@field:SerializedName("updatedAt")
	val updatedAt: String? = null,

	@field:SerializedName("area")
	val area: String? = null,

	@field:SerializedName("serviceFee")
	val serviceFee: Any? = null,

	@field:SerializedName("deliveryFullFillType")
	val deliveryFullFillType: Any? = null,

	@field:SerializedName("bankInfo")
	val bankInfo: Any? = null,

	@field:SerializedName("updatedBy")
	val updatedBy: UpdatedBy? = null,

	@field:SerializedName("vat")
	val vat: Any? = null,

	@field:SerializedName("merchant")
	val merchant: Any? = null,

	@field:SerializedName("baseDeliveryCharge")
	val baseDeliveryCharge: Int? = null,

	@field:SerializedName("endAt")
	val endAt: Any? = null,

	@field:SerializedName("shopBrand")
	val shopBrand: Any? = null,

	@field:SerializedName("prepareTime")
	val prepareTime: Int? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("personalDetails")
	val personalDetails: Any? = null,

	@field:SerializedName("numberOfRating")
	val numberOfRating: Int? = null,

	@field:SerializedName("status")
	val status: String? = null,

	@field:SerializedName("commissionAmount")
	val commissionAmount: Any? = null,

	@field:SerializedName("minimumWithdrawalAmount")
	val minimumWithdrawalAmount: Any? = null,

	@field:SerializedName("numberOfFollowers")
	val numberOfFollowers: Int? = null,

	@field:SerializedName("distance")
	val distance: Any? = null,

	@field:SerializedName("city")
	val city: String? = null,

	@field:SerializedName("isVerified")
	val isVerified: Any? = null,

	@field:SerializedName("displayOrder")
	val displayOrder: Int? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("timeRemaining")
	val timeRemaining: Any? = null,

	@field:SerializedName("promoDescription")
	val promoDescription: Any? = null,

	@field:SerializedName("products")
	val products: Any? = null,

	@field:SerializedName("promo")
	val promo: Any? = null,

	@field:SerializedName("contactNumber")
	val contactNumber: String? = null,

	@field:SerializedName("businessOperationType")
	val businessOperationType: Any? = null,

	@field:SerializedName("resellerCommissionAmount")
	val resellerCommissionAmount: Any? = null,

	@field:SerializedName("closeCause")
	val closeCause: Any? = null,

	@field:SerializedName("email")
	val email: String? = null,

	@field:SerializedName("startAt")
	val startAt: Any? = null,

	@field:SerializedName("dineIn")
	val dineIn: Any? = null,

	@field:SerializedName("address")
	val address: String? = null,

	@field:SerializedName("mobileBankService")
	val mobileBankService: Any? = null,

	@field:SerializedName("orderCount")
	val orderCount: Int? = null,

	@field:SerializedName("banner")
	val banner: String? = null,

	@field:SerializedName("merchantIds")
	val merchantIds: Any? = null,

	@field:SerializedName("locationObj")
	val locationObj: Any? = null,

	@field:SerializedName("flashDiscount")
	val flashDiscount: Any? = null,

	@field:SerializedName("isFreeDelivery")
	val isFreeDelivery: Boolean? = null,

	@field:SerializedName("minimumAmountForFreeDelivery")
	val minimumAmountForFreeDelivery: Int? = null,

	@field:SerializedName("resellerCommissionType")
	val resellerCommissionType: Any? = null,

	@field:SerializedName("versionCode")
	val versionCode: Any? = null,

	@field:SerializedName("commissionType")
	val commissionType: Any? = null,

	@field:SerializedName("businessTypeId")
	val businessTypeId: Any? = null,

	@field:SerializedName("keyWord")
	val keyWord: Any? = null,

	@field:SerializedName("merchantBusinessInfo")
	val merchantBusinessInfo: Any? = null,

	@field:SerializedName("deleted")
	val deleted: Boolean? = null,

	@field:SerializedName("hub")
	val hub: Any? = null,

	@field:SerializedName("createdBy")
	val createdBy: CreatedBy? = null,

	@field:SerializedName("metaTitle")
	val metaTitle: Any? = null,

	@field:SerializedName("totalProducts")
	val totalProducts: Any? = null,

	@field:SerializedName("location")
	val location: Location? = null,

	@field:SerializedName("totalOrders")
	val totalOrders: Any? = null,

	@field:SerializedName("merchants")
	val merchants: Any? = null
)

data class ChildsItem(

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("slug")
	val slug: String? = null
)

data class ShippingInfo(

	@field:SerializedName("allowFreeShipping")
	val allowFreeShipping: Boolean? = null,

	@field:SerializedName("allowEconomyDelivery")
	val allowEconomyDelivery: Boolean? = null,

	@field:SerializedName("unit")
	val unit: String? = null,

	@field:SerializedName("allowStandardDelivery")
	val allowStandardDelivery: Boolean? = null,

	@field:SerializedName("weight")
	val weight: Any? = null,

	@field:SerializedName("dimension")
	val dimension: Dimension? = null,

	@field:SerializedName("allowScheduleDelivery")
	val allowScheduleDelivery: Boolean? = null,

	@field:SerializedName("allowPriorityDelivery")
	val allowPriorityDelivery: Boolean? = null
)

data class Customer(

	@field:SerializedName("profilePicture")
	val profilePicture: String? = null,

	@field:SerializedName("mobileNumber")
	val mobileNumber: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("isNewUser")
	val isNewUser: Any? = null,

	@field:SerializedName("email")
	val email: Any? = null
)
