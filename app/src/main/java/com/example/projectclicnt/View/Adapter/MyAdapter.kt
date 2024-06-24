package com.example.projectclicnt.View.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.example.Products
import com.example.projectclicnt.databinding.ProductItemBinding


class MyAdapter  : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    private var products: List<Products> = mutableListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            ProductItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val mProduct = products[position]
        holder.bind(mProduct)
    }

    fun setAdapter(lsProducts: List<Products>) {
        products = lsProducts
    }

    override fun getItemCount(): Int {
        return products.size
    }

    class MyViewHolder(val binding: ProductItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(product: Products) {
            binding.tvProductTitel.text = product.name
            binding.tvProductPrice.text = product.variations[0].price?.mrp.toString()
            binding.tvCurrecntBid.text = product.auction?.currentPrice.toString()
            binding.tvlocation.text = product.shop?.location?.type
            binding.tvEndsofBidTime.text = product.auction?.endDate.toString()

            Glide.with(binding.imageViewProduct.context).load(product.productImage)
                .into(binding.imageViewProduct)

        }

    }

}
