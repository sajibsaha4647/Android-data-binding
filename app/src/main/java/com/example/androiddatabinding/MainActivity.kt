package com.example.androiddatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.androiddatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        var itemdata = "sajib saha"
        var email = "sajibsaha@gmail.com"


        binding.textviews.text = itemdata
//        binding.textviews.setText(itemdata)

        //view binding

        val quoteobj = Quotedata(itemdata,email);

        binding.quote = quoteobj


    }
}