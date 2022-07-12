package kr.co.crystalspoon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import kr.co.crystalspoon.databinding.ActivityRestDetailBinding
import kr.co.crystalspoon.fragment.RestDetailInfoFragment
import kr.co.crystalspoon.fragment.RestDetailMenuFragment
import kr.co.crystalspoon.fragment.RestDetailReviewFragment

class RestDetailActivity : AppCompatActivity() {

    val binding by lazy { ActivityRestDetailBinding.inflate(layoutInflater) }

    private val fragmentInfo by lazy { RestDetailInfoFragment() }
    private val fragmentMenu by lazy { RestDetailMenuFragment() }
    private val fragmentReview by lazy { RestDetailReviewFragment() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // 삼중 토글 버튼 구현 (정보/메뉴/리뷰)
        binding.restTextInfoBtn.setOnClickListener {
            binding.restTextInfoBtn.setTextColor(ContextCompat.getColor(this, R.color.sujung_purple))
            binding.restTextMenuBtn.setTextColor(ContextCompat.getColor(this, R.color.purple_110))
            binding.restTextReviewBtn.setTextColor(ContextCompat.getColor(this, R.color.purple_110))
            changeFragment(fragmentInfo)
        }
        binding.restTextMenuBtn.setOnClickListener {
            binding.restTextInfoBtn.setTextColor(ContextCompat.getColor(this, R.color.purple_110))
            binding.restTextMenuBtn.setTextColor(ContextCompat.getColor(this, R.color.sujung_purple))
            binding.restTextReviewBtn.setTextColor(ContextCompat.getColor(this, R.color.purple_110))
            changeFragment(fragmentMenu)
        }
        binding.restTextReviewBtn.setOnClickListener {
            binding.restTextInfoBtn.setTextColor(ContextCompat.getColor(this, R.color.purple_110))
            binding.restTextMenuBtn.setTextColor(ContextCompat.getColor(this, R.color.purple_110))
            binding.restTextReviewBtn.setTextColor(ContextCompat.getColor(this, R.color.sujung_purple))
            changeFragment(fragmentReview)
        }
    }

    fun changeFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.rest_frame, fragment)
            .commit()
    }
}