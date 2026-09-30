package com.example.sample1

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Example3_2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example3_2)
        supportActionBar?.title = "[예제 3-2] 메서드 텍스트 뷰 속성"

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = "Hello World!"
        textView.setTextColor(Color.parseColor("#03A9F4"))
        textView.setTypeface(Typeface.SERIF)
        textView.setTextSize(50f)
    }
}
