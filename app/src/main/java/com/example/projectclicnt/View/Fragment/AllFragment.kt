package com.example.projectclicnt.View.Fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.example.ResponceData
import com.example.projectclicnt.Network.RetrofitInstance
import com.example.projectclicnt.View.Adapter.MyAdapter
import com.example.projectclicnt.databinding.FragmentAllBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class AllFragment : Fragment() {
    private lateinit var binding: FragmentAllBinding

    //    private val binding get() = _binding!!
    private lateinit var myAdapter: MyAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentAllBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            myAdapter = MyAdapter()
            adapter = myAdapter
        }

        fetchProducts()
    }

    private fun fetchProducts() {
        val call = RetrofitInstance.api.getProductData(
            productType = "AUCTION",
            isDeleted = false,
            minimumStock = 10000000,
            sortBy = "displayOrder",
            sortOrder = "ASC",
            page = 0,
            limit = 20
        )

        call.enqueue(object : Callback<ResponceData> {
            @SuppressLint("NotifyDataSetChanged")
            override fun onResponse(call: Call<ResponceData>, response: Response<ResponceData>) {
                if (response.isSuccessful) {
                    val responseData = response.body()!!
                    val products = responseData.products
                    myAdapter.setAdapter(products)
                    myAdapter.notifyDataSetChanged()
                } else {
                    Toast.makeText(context, "Failed to retrieve data", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<ResponceData>, t: Throwable) {
                Toast.makeText(context, "Error: ${t.message}", Toast.LENGTH_SHORT).show()
            }
        })
    }
}