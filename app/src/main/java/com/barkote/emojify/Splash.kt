package com.barkote.emojify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.barkote.emojify.databinding.ActivitySplashBinding

class Splash : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashBinding.inflate(layoutInflater)

        setContentView(binding.root)




    }
}