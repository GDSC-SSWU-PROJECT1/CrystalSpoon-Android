package kr.co.crystalspoon

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kr.co.crystalspoon.databinding.ListitemSearchHistoryBinding


class SearchHistoryAdapter : RecyclerView.Adapter<SearchHistoryHolder>(){
    var listData = mutableListOf<SearchHistoryData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchHistoryHolder {
        val binding= ListitemSearchHistoryBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return SearchHistoryHolder(binding)
    }

    override fun onBindViewHolder(holder: SearchHistoryHolder, position: Int) {
        val memo = listData.get(position)
        holder.setMemo(memo)
    }

    override fun getItemCount(): Int {
        return listData.size
    }
}
class SearchHistoryHolder(val binding: ListitemSearchHistoryBinding): RecyclerView.ViewHolder(binding.root){
    fun setMemo(memo:SearchHistoryData){
        binding.searTxtHistory.text=memo.title
    }
}