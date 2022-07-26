package kr.co.crystalspoon

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kr.co.crystalspoon.databinding.ActivityReviewBinding
import kr.co.crystalspoon.databinding.ActivityWheelBinding

class WheelActivity : AppCompatActivity() {

    val binding by lazy { ActivityWheelBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wheel)

        binding.wheelBtnBack.setOnClickListener {
            finish()
        }
    }
}