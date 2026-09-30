package com.example.sample1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Example3_1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example3_1)
        supportActionBar?.title = "[예제 3-1] XML 텍스트 뷰 속성"
    }
}
