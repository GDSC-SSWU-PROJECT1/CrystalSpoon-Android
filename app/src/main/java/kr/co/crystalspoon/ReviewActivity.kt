package kr.co.crystalspoon

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kr.co.crystalspoon.databinding.ActivityReviewBinding

class ReviewActivity: AppCompatActivity() {

    val binding by lazy { ActivityReviewBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review)

        binding.reviewBtnBack.setOnClickListener {
            finish()
        }
    }
}