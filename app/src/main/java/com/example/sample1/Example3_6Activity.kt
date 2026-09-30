package com.example.sample1

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Example3_6Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example3_6)
        supportActionBar?.title = "[예제 3-6] 이미지 버튼 상태별 변경"

        val imageButton = findViewById<ImageButton>(R.id.imageButton)
        val btnToggleSelect = findViewById<Button>(R.id.btnToggleSelect)

        btnToggleSelect.setOnClickListener {
            imageButton.isSelected = !imageButton.isSelected
        }
    }
}
