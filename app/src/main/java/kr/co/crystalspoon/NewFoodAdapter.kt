package kr.co.crystalspoon

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class NewFoodAdapter(private val newFoodList: ArrayList<NewFood>):RecyclerView.Adapter<NewFoodAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent:ViewGroup, viewType: Int): NewFoodAdapter.ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.listitem_newbestfood,parent,false)
        return ViewHolder(view).apply{
            itemView.setOnClickListener{//itemView는 뷰홀더의 아이템들
                val itemPos: Int=adapterPosition //누른 뷰의 순서값
                val food: NewFood=newFoodList.get(itemPos)
                Toast.makeText(parent.context,"식당이름: ${food.food_name}", Toast.LENGTH_SHORT).show()
            }

        }
    }

    override fun onBindViewHolder(holder: NewFoodAdapter.ViewHolder, position: Int) {
        holder.food_image.setImageResource(newFoodList.get(position).food_image)
        holder.food_name.text=newFoodList.get(position).food_name

    }
    override fun getItemCount(): Int {
        return newFoodList.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val food_image=itemView.findViewById<ImageView>(R.id.newr_img_newfood)
        val food_name=itemView.findViewById<TextView>(R.id.newr_txt_newfoodName)

    }

}