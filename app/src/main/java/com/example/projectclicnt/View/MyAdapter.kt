package com.example.projectclicnt.View

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.example.Product
import com.example.projectclicnt.R
import com.example.projectclicnt.databinding.ProductItemBinding


class MyAdapter(private val products: List<Product>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater =
            LayoutInflater.from(parent.context).inflate(R.layout.product_item, parent, false)
        return MyViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val mProduct = products[position]
        holder.bind(mProduct)
    }

    override fun getItemCount(): Int {
        return products.size
    }

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private lateinit var binding: ProductItemBinding
        fun bind(product: Product) {
            binding.tvProductTitel.text= product.name
            binding.tvProductPrice.text=product.variations[0].price?.mrp.toString()
            binding.tvCurrecntBid.text=product.auction?.currentPrice.toString()
            binding.tvlocation.text=product.location?.type
            binding.tvEndsofBidTime.text=product.auction?.endDate.toString()

        }

    }

}
