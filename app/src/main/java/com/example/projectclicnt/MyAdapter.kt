import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.projectclicnt.R
import com.example.projectclicnt.databinding.ProductItemBinding

class MyAdapter: RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

//    var userList = mutableListOf<User>()
    class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {

        private lateinit var binding: ProductItemBinding
        fun bind(){
//            binding.imageViewProduct.

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val inflater=LayoutInflater.from(parent.context).inflate(R.layout.product_item,parent,false)
        return MyViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}
