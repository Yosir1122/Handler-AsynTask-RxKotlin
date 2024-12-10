package com.example.myapplication

import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private var currentNumber = 0
    private val handler = Handler()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        handler.postDelayed(object : Runnable {
            override fun run() {
                if (currentNumber <= 5) {
                    binding.sanoq.text = currentNumber.toString()
                    currentNumber++
                    handler.postDelayed(this, 500)
                }
            }
        }, 500)
    }
}