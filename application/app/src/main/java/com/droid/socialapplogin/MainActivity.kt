package com.droid.socialapplogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.droid.socialapplogin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            instagramBtnId.setOnClickListener {
                initiateInstagramLogin()
            }
        }
    }

    private fun initiateInstagramLogin() {
        
    }


}