package kr.co.crystalspoon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CommActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comm)

        val item = resources.getStringArray(R.array.spinner_array_comm)

    }
}