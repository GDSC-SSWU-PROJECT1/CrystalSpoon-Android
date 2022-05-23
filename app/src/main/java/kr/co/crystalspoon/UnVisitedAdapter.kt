package kr.co.crystalspoon

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class UnVisitedAdapter(private val unVisitedList: ArrayList<UnVisited>): RecyclerView.Adapter<UnVisitedAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UnVisitedAdapter.ViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.listitem_unvisitedfood,parent,false)
        return ViewHolder(view).apply{
            itemView.setOnClickListener{//itemView는 뷰홀더의 아이템들
                val itemPos: Int=adapterPosition //누른 뷰의 순서값
                val food: UnVisited=unVisitedList.get(itemPos)
                Toast.makeText(parent.context,"식당이름: ${food.unvisited_name}", Toast.LENGTH_SHORT).show()
            }

        }
    }

    override fun onBindViewHolder(holder: UnVisitedAdapter.ViewHolder, position: Int) {
        holder.unvisited_image.setImageResource(unVisitedList.get(position).unvisited_image)
        holder.unvisited_name.text=unVisitedList.get(position).unvisited_name
        holder.unvisited_category.text=unVisitedList.get(position).unvisited_category
        holder.unvisited_distance.text=unVisitedList.get(position).unvisited_distance
    }
    override fun getItemCount(): Int {
        return unVisitedList.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val unvisited_image=itemView.findViewById<ImageView>(R.id.newr_img_unvisitedImage)
        val unvisited_name=itemView.findViewById<TextView>(R.id.newr_txt_unvisitedName )
        val unvisited_category=itemView.findViewById<TextView>(R.id.newr_txt_category)
        val unvisited_distance=itemView.findViewById<TextView>(R.id.newr_txt_distance)

    }

}