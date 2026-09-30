package com.example.sample1

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Example3_5Activity : AppCompatActivity() {
    private val images = intArrayOf(
        R.drawable.img1,
        R.drawable.img2,
        R.drawable.img3
    )
    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example3_5)
        supportActionBar?.title = "[예제 3-5] 이미지 뷰 이미지 넘기기"

        val imageView = findViewById<ImageView>(R.id.imageView)
        val btnNext = findViewById<Button>(R.id.btnNext)

        btnNext.setOnClickListener {
            currentIndex = (currentIndex + 1) % images.size
            imageView.setImageResource(images[currentIndex])
        }
    }
}
