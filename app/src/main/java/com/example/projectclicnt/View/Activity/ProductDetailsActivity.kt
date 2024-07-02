package com.example.projectclicnt.View.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.projectclicnt.databinding.ActivityProductDetailsBinding

class ProductDetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProductDetailsBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProductDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)



//        val productId = intent.getStringExtra("productId")
        val productName = intent.getStringExtra("productName")
        val productPrice = intent.getStringExtra("productPrice")
//        val productBrand = intent.getStringExtra("Brand Information")
        val productRating = intent.getFloatExtra("Rating", 0.0f)
        val productsImage = intent.getStringExtra("productImage")




        binding.tvProductTitel.text = productName
        binding.tvProductPrice.text = productPrice
//        binding.tvBrandInformation.text = productBrand
        binding.tvRatingNum.text = productRating.toString()

        Glide.with(this)
            .load(productsImage)
            .into(binding.ProductFullImage)



    }

}