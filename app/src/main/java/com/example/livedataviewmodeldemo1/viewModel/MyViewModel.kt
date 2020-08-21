package com.example.livedataviewmodeldemo1.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.livedataviewmodeldemo1.data.Trigger

class MyViewModel: ViewModel() {
    val liveData = MutableLiveData<Trigger>()

    val trigger = Trigger()

    fun trigger() {
        trigger.count++
        liveData.value = trigger
    }
}