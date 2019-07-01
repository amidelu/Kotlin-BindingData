package com.andro4everyone.bindingdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.andro4everyone.bindingdata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.contact = Contact("Captain Marvel", "xyz@gmail.com")

        binding.handler = EventHandler(this)

        binding.imageUrl = "https://i.redd.it/lhw4vp5yoy121.jpg"
    }
}
