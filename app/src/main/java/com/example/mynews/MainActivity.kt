package com.example.mynews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler()
            .postDelayed({
                startActivity(Intent(this@MainActivity,HomeActivity::class.java))
                finish()
            },2000);
    }
}