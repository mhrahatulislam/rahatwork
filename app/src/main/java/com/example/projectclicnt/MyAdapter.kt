

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.projectclicnt.R
import com.example.projectclicnt.databinding.ProductItemBinding
import com.example.projectclicnt.model.Location
import com.example.projectclicnt.model.Price
import com.example.projectclicnt.model.Product
import com.example.projectclicnt.model.Responc


class MyAdapter (private val products: List<Responc>): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {

        private lateinit var binding: ProductItemBinding
        fun bind(price: Price,product: Product,location: Location,){
            binding.tvProductTitel.text= product.name
            binding.tvProductPrice.text= price.mrp.toString()
            binding.tvlocation.text=location.type

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val inflater=LayoutInflater.from(parent.context).inflate(R.layout.product_item,parent,false)
        return MyViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {



    }

    override fun getItemCount(): Int {
        return products.size
    }

}
