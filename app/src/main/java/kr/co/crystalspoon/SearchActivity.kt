package kr.co.crystalspoon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kr.co.crystalspoon.databinding.ActivitySearchBinding

class SearchActivity : AppCompatActivity() {
    val binding by lazy {ActivitySearchBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
//popurity
        val data1 :MutableList<SearchPopularityData> = loadData1()
        var adapter1=SearchPopularityAdapter()
        adapter1.listData=data1
        binding.recyPoplar.adapter=adapter1

        binding.recyPoplar.layoutManager=GridLayoutManager(this,2)
//history
        val data2 :MutableList<SearchHistoryData> = loadData2()
        var adapter2=SearchHistoryAdapter()
        adapter2.listData=data2
        binding.recyHistory.adapter=adapter2

        binding.recyHistory.layoutManager=LinearLayoutManager(this)

    }
    fun loadData1():MutableList<SearchPopularityData>{
        val data:MutableList<SearchPopularityData> = mutableListOf()
        for(no in 1 .. 10){
            val title  = "마라탕"
            var searchPopurity=SearchPopularityData(no, title)
            data.add(searchPopurity)
        }
        return data
    }

    fun loadData2():MutableList<SearchHistoryData>{
        val data:MutableList<SearchHistoryData> = mutableListOf()
        for(no in 1 .. 10){
            val title  = "꿔바로우"
            var searchHistory=SearchHistoryData(title)
            data.add(searchHistory)
        }
        return data
    }
}