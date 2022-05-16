package kr.co.crystalspoon

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kr.co.crystalspoon.databinding.ListitemSearchPopularityBinding


class SearchPopularityAdapter :RecyclerView.Adapter<SearchPopularHolder>(){
    var listData = mutableListOf<SearchPopularityData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchPopularHolder {
        val binding=ListitemSearchPopularityBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return SearchPopularHolder(binding)
    }

    override fun onBindViewHolder(holder: SearchPopularHolder, position: Int) {
        val memo = listData.get(position)
        holder.setMemo(memo)
    }

    override fun getItemCount(): Int {
        return listData.size
    }
}
class SearchPopularHolder(val binding:ListitemSearchPopularityBinding): RecyclerView.ViewHolder(binding.root){
    fun setMemo(memo:SearchPopularityData){
        binding.searTxtPopularityNumber.text="${memo.no}"
        binding.searTxtPopularityTitle.text=memo.title
    }
}