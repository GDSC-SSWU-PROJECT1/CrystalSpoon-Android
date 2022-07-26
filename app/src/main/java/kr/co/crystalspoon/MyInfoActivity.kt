package kr.co.crystalspoon

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kr.co.crystalspoon.databinding.ActivityMyInfoBinding
import kr.co.crystalspoon.databinding.ActivitySettingBinding

class MyInfoActivity: AppCompatActivity() {

    val binding by lazy { ActivityMyInfoBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_info)

        binding.myInfoBtnBack.setOnClickListener {
            finish()
        }
    }
}