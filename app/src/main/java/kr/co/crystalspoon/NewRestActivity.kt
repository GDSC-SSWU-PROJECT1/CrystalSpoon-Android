package kr.co.crystalspoon
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kr.co.crystalspoon.databinding.ActivityNewRestBinding

class NewRestActivity: AppCompatActivity() {
    private var mBinding: ActivityNewRestBinding?=null
    private val binding get()=mBinding!!
    //private LinearLayoutManager newFood,unVisited
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_rest)
        mBinding= ActivityNewRestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //새로운 맛집리스트 추가
        val newFoodList= arrayListOf(
            NewFood(R.drawable.img_oneoff,"수아당"),
            NewFood(R.drawable.img_oneoff,"원오프"),
            NewFood(R.drawable.img_oneoff,"도쿄빙수"),
            NewFood(R.drawable.img_oneoff,"안녕베트남"),
        )
        //아직 방문하지 않은 맛집리스트 추가
        val unVisitedList= arrayListOf(
            UnVisited(R.drawable.img_losdias,"로스디아스","카페","2km"),
            UnVisited(R.drawable.img_losdias,"로스디아스","카페","2km"),
            UnVisited(R.drawable.img_losdias,"로스디아스","카페","2km"),
            UnVisited(R.drawable.img_losdias,"로스디아스","카페","2km"),
        )

        //가로스크롤
        binding.newrRcyNewr.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        binding.newrRcyUnvisited.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        binding.newrRcyNewr.setHasFixedSize(true)
        binding.newrRcyUnvisited.setHasFixedSize(true)

        //어댑터 recyclerView 아이디값 다르게 해야함
        binding.newrRcyNewr.adapter = NewFoodAdapter(newFoodList)
        binding.newrRcyUnvisited.adapter = UnVisitedAdapter(unVisitedList)
    }
}

