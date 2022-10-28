package com.example.homework6_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework6_1.databinding.ActivitySecondBinding
import com.example.homework6_1.databinding.FragmentSecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

      val value=  intent.getStringExtra("Key1")
        binding.tvNames.text=value

    }

}