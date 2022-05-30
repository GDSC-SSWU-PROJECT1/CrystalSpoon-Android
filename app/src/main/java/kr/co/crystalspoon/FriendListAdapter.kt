package kr.co.crystalspoon

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class FriendListAdapter(private val mFriendList: ArrayList<FriendList>): RecyclerView.Adapter<FriendListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendListAdapter.ViewHolder {
        val view=
            LayoutInflater.from(parent.context).inflate(R.layout.listitem_friend,parent,false)
        return ViewHolder(view).apply{
            itemView.setOnClickListener{//itemView는 뷰홀더의 아이템들
                val itemPos: Int=adapterPosition //누른 뷰의 순서값
                val friendName: FriendList=mFriendList.get(itemPos)
                Toast.makeText(parent.context,"친구 이름: ${friendName.friend_nickname}", Toast.LENGTH_SHORT).show()
            }

        }
    }

    override fun onBindViewHolder(holder: FriendListAdapter.ViewHolder, position: Int) {
        holder.friend_profile.setImageResource(mFriendList.get(position).friend_profile)
        holder.friend_nickname.text=mFriendList.get(position).friend_nickname

    }
    override fun getItemCount(): Int {
        return mFriendList.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val friend_profile=itemView.findViewById<ImageView>(R.id.friend_profile)
        val friend_nickname=itemView.findViewById<TextView>(R.id.friend_nickname)

    }

}