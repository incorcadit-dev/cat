package com.example.sample1

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Example3_3Activity : AppCompatActivity() {
    private lateinit var editNum1: EditText
    private lateinit var editNum2: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example3_3)
        supportActionBar?.title = "[예제 3-3] 버튼 클릭 두 수의 합"

        editNum1 = findViewById(R.id.editNum1)
        editNum2 = findViewById(R.id.editNum2)
    }

    fun calcSum(view: View) {
        val str1 = editNum1.text.toString()
        val str2 = editNum2.text.toString()
        if (str1.isNotEmpty() && str2.isNotEmpty()) {
            val num1 = str1.toInt()
            val num2 = str2.toInt()
            val sum = num1 + num2
            Toast.makeText(this, "두 수의 합: $sum", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "숫자를 모두 입력해주세요.", Toast.LENGTH_SHORT).show()
        }
    }
}
