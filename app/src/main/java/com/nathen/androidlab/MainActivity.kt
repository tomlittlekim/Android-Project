package com.nathen.androidlab

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 화면 출력 XML 명시
        setContentView(R.layout.activity_main)
    }
}