package com.example.livedataviewmodeldemo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.livedataviewmodeldemo1.databinding.ActivityMainBinding
import com.example.livedataviewmodeldemo1.viewModel.MyViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var dataBinding: ActivityMainBinding
    private lateinit var viewModelMain: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //    setContentView(R.layout.activity_main)
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        viewModelMain = ViewModelProviders.of(this).get(MyViewModel::class.java)
        dataBinding.viewModelxml = viewModelMain

        //set the "LifeCycleOwner" to update the ui changed
        dataBinding.setLifecycleOwner(this)
    }
}
