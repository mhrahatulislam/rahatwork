package com.example.projectclicnt.View.Activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.projectclicnt.Model.PostModel.BidRequest
import com.example.projectclicnt.Model.PostModel.BidResponse
import com.example.projectclicnt.Network.RetrofitClient
import com.example.projectclicnt.databinding.ActivityProductDetailsBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ProductDetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProductDetailsBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProductDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val productName = intent.getStringExtra("productName")
        val productPrice = intent.getStringExtra("productPrice")
        val productBrand = intent.getStringExtra("Brand Information")
        val productRating = intent.getFloatExtra("Rating", 0.0f)
        val productsImage = intent.getStringExtra("productImage")
        val bidDate = intent.getStringExtra("startingPrice")
        val productId = intent.getStringExtra("productId")

        binding.tvProductTitel.text = productName
        binding.tvProductPrice.text = productPrice
        binding.tvBrandInformation.text = productBrand
        binding.tvRatingNum.text = productRating.toString()
        binding.tvBidPrice.text = bidDate

        Glide.with(this)
            .load(productsImage)
            .into(binding.ProductFullImage)

        binding.btnPlaceBid.setOnClickListener {
            val bidAmountText = binding.etBidPrice.text.toString()
            if (bidAmountText.isNotEmpty()) {
                val bidAmount = bidAmountText.toInt()
                val token = "YOUR_BEARER_TOKEN_HERE" // Replace with your actual token

                if (productId != null) {
                    val bidRequest = BidRequest(bidAmount, productId)

                    RetrofitClient.apiService.placeBid("Bearer $token", bidRequest)
                        .enqueue(object : Callback<BidResponse> {
                            override fun onResponse(call: Call<BidResponse>, response: Response<BidResponse>) {
                                if (response.isSuccessful) {
                                    Toast.makeText(this@ProductDetailsActivity, "Response: ${response.body()?.message}", Toast.LENGTH_LONG).show()
                                } else {
                                    Toast.makeText(this@ProductDetailsActivity, "Failed to place bid", Toast.LENGTH_LONG).show()
                                }
                            }

                            override fun onFailure(call: Call<BidResponse>, t: Throwable) {
                                Toast.makeText(this@ProductDetailsActivity, "Error: ${t.message}", Toast.LENGTH_LONG).show()
                            }
                        })
                } else {
                    Toast.makeText(this, "Product ID is missing", Toast.LENGTH_LONG).show()
                }
            } else {
                Toast.makeText(this, "Please enter a bid amount", Toast.LENGTH_LONG).show()
            }
        }


    }

}