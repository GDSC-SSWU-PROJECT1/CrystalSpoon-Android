package kr.co.crystalspoon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.crystalspoon.databinding.ActivityWishBinding

class WishActivity : AppCompatActivity() {

    val binding by lazy { ActivityWishBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
}