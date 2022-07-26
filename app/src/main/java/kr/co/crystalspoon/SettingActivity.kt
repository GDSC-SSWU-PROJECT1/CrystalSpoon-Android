package kr.co.crystalspoon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.crystalspoon.databinding.ActivitySettingBinding

class SettingActivity : AppCompatActivity() {

    val binding by lazy { ActivitySettingBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        binding.settingBtnBack.setOnClickListener {
            finish()
        }

    }
}