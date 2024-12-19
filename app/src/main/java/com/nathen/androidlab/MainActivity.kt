package com.nathen.androidlab

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 화면 출력 XML 명시
        setContentView(R.layout.activity_main)
        // id값으로 뷰 객체 획득
        val textView1 = findViewById<TextView>(R.id.text1)
    }
}