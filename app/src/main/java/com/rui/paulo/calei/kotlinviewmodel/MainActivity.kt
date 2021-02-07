package com.rui.paulo.calei.kotlinviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.rui.paulo.calei.kotlinviewmodel.databinding.ActivityMainBinding
import com.rui.paulo.calei.kotlinviewmodel.view.model.MainActivityViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        binding.countTv.text = viewModel.getCurrentCount().toString()

        binding.countBtn.setOnClickListener{
            binding.countTv.text = viewModel.getUpdatedCount().toString()
        }
    }
}