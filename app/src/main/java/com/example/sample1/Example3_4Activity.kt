package com.example.sample1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Example3_4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example3_4)
        supportActionBar?.title = "[예제 3-4] 에디트 텍스트 inputType"

        val editName = findViewById<EditText>(R.id.editName)
        val editPassword = findViewById<EditText>(R.id.editPassword)
        val editEmail = findViewById<EditText>(R.id.editEmail)
        val editDate = findViewById<EditText>(R.id.editDate)
        val editPhone = findViewById<EditText>(R.id.editPhone)
        val btnResult = findViewById<Button>(R.id.btnResult)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnResult.setOnClickListener {
            val name = editName.text.toString()
            val password = editPassword.text.toString()
            val email = editEmail.text.toString()
            val date = editDate.text.toString()
            val phone = editPhone.text.toString()

            tvResult.text = "이름: $name\n비밀번호: $password\n이메일: $email\n생일: $date\n전화번호: $phone"
        }
    }
}
