package com.example.projectclicnt.View.Activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.projectclicnt.Model.GetData.ResponceData
import com.example.projectclicnt.Network.RetrofitInstance
import com.example.projectclicnt.View.Adapter.TabAdapter
import com.example.projectclicnt.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.google.android.material.tabs.TabLayout.TabLayoutOnPageChangeListener
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        testRetrofit()

        binding.tblCatagory.addTab(binding.tblCatagory.newTab().setText("All"))
        binding.tblCatagory.addTab(binding.tblCatagory.newTab().setText("Women's Fashion"))
        binding.tblCatagory.addTab(binding.tblCatagory.newTab().setText("Health Beauty"))
        binding.tblCatagory.addTab(binding.tblCatagory.newTab().setText("Health Bea"))
        binding.tblCatagory.tabGravity = TabLayout.GRAVITY_FILL

        val adapter = TabAdapter(this, supportFragmentManager, binding.tblCatagory.tabCount)

        binding.viViewpagerCatagory.adapter = adapter

        binding.viViewpagerCatagory.addOnPageChangeListener(TabLayoutOnPageChangeListener(binding.tblCatagory))

        binding.tblCatagory.addOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                binding.viViewpagerCatagory.currentItem = tab!!.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}

            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })


    }
    private fun testRetrofit() {
        val call = RetrofitInstance.api.getProductData(
            productType= "AUCTION",
            isDeleted = false,
            minimumStock = 10000000,
            sortBy = "displayOrder",
            sortOrder = "asc",
            page = 0,
            limit = 20
        )

        call.enqueue(object : Callback<ResponceData> {
            override fun onResponse(call: Call<ResponceData>, response: Response<ResponceData>) {
                if (response.isSuccessful) {
                    // Handle successful response
                    val responseData = response.body()
                    Log.d("Retrofit", "Response: $responseData")
                } else {
                    // Handle request errors depending on status code
                    Log.e("Retrofit", "Error: ${response.errorBody()?.string()}")
                }
            }

            override fun onFailure(call: Call<ResponceData>, t: Throwable) {
                // Handle failure
                Log.e("Retrofit", "Failure: ${t.message}")
            }
        })
    }

}



