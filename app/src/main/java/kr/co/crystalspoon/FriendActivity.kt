package kr.co.crystalspoon

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kr.co.crystalspoon.databinding.ActivityFriendBinding

class FriendActivity: AppCompatActivity() {
    private var mBinding: ActivityFriendBinding?=null
    private val binding get()=mBinding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friend)
        mBinding= ActivityFriendBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //친구목록
        val mFriendList=arrayListOf(
            FriendList(R.drawable.img_friendprofile,"꿈많은솜사탕소녀"),
            FriendList(R.drawable.img_friendprofile,"말랑쪼꼬볼"),
            FriendList(R.drawable.img_friendprofile,"먹물소시지핫도그"),
            FriendList(R.drawable.img_friendprofile,"다롱아밥먹자"),
            FriendList(R.drawable.img_friendprofile,"바나나킥"),
            FriendList(R.drawable.img_friendprofile,"딸기가조아"),
            FriendList(R.drawable.img_friendprofile,"웰치스우웩"),
        )

        //세로스크롤
        binding.friendRcy.layoutManager=
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        binding.friendRcy.setHasFixedSize(true)

        //어댑터 recyclerView
        binding.friendRcy.adapter= FriendListAdapter(mFriendList)
    }
}