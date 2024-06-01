package com.example.projectclicnt.View

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.apusing.ApiServ.RetrofitInstance
import com.example.example.Product
import com.example.example.ResponceData
import com.example.projectclicnt.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var myAdapter: MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        testRetrofit()
    }
    private fun testRetrofit() {
        val call = RetrofitInstance.api.getProductData(
            productType = "exampleType",
            isDeleted = false,
            minimumStock = 10,
            sortBy = "name",
            sortOrder = "asc",
            page = 1,
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


