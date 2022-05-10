package kr.co.crystalspoon
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kr.co.crystalspoon.*

class NewRestActivity: AppCompatActivity() {
    private var mBinding: ActivityMainBinding?=null
    private val binding get()=mBinding!!
    //private LinearLayoutManager newFood,unVisited
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newrest)
        mBinding= ActivityMainBinding.inflate(layoutInflater)
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
        binding.newr_rcy_newr.layoutManager=
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        binding.newr_rcy_unvisited.layoutManager=
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        binding.newr_rcy_newr.setHasFixedSize(true)
        binding.newr_rcy_unvisited.setHasFixedSize(true)

        //어댑터 recyclerView 아이디값 다르게 해야함
        binding.newr_rcy_newr.adapter= NewFoodAdapter(newFoodList)
        binding.newr_rcy_unvisited.adapter= UnVisitedAdapter(unVisitedList)
    }
}

