package com.example.projectclicnt.View.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectclicnt.R
import com.example.projectclicnt.databinding.ActivityProductDetailsBinding

class ProductDetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProductDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProductDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        setContentView(R.layout.activity_product_details)

    }

}