package com.example.projectclicnt

import MyAdapter
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projectclicnt.databinding.ActivityLoginBinding
import com.example.projectclicnt.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var myAdapter: MyAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        recyclerView = findViewById(R.id.recMain)
//        recyclerView.layoutManager = LinearLayoutManager(this)

//        fetchProducts()
    }

//    private fun fetchProducts() {
//        val retroInstance = RetroInstance()
//        val call = retroInstance.retroService.getProducts(
//            productType = "AUCTION",
//            isDeleted = false,
//            minimumStock = 10000000L,
//            sortBy = "displayOrder",
//            sortOrder = "ASC",
//            page = 0,
//            limit = 20
//        )
//
//        call.enqueue(object : Callback<ProductResponse> {
//            override fun onResponse(call: Call<ProductResponse>, response: Response<ProductResponse>) {
//                if (response.isSuccessful) {
//                    val productResponse = response.body()
//                    if (productResponse != null) {
//                        myAdapter = MyAdapter(productResponse.products)
//                        recyclerView.adapter = myAdapter
//                    }
//                } else {
//                    Log.e("MainActivity", "Error: ${response.errorBody()}")
//                }
//            }
//
//            override fun onFailure(call: Call<ProductResponse>, t: Throwable) {
//                t.printStackTrace()
//            }
//        })
//    }
}
