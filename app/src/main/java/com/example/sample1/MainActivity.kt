package com.example.sample1

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val catImages = intArrayOf(
        R.drawable.cat1,
        R.drawable.cat2,
        R.drawable.cat3,
        R.drawable.cat4,
        R.drawable.cat5
    )
    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "[예제 3-6] 이미지 버튼 실습"

        val imageView = findViewById<ImageView>(R.id.imageView)
        val imageButton = findViewById<ImageButton>(R.id.imageButton)

        imageButton.setOnClickListener {
            currentIndex = (currentIndex + 1) % catImages.size
            imageView.setImageResource(catImages[currentIndex])
        }
    }
}
