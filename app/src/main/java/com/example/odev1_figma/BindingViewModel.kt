package com.example.odev1_figma
import androidx.lifecycle.MutableLiveData

class BindingViewModel() {
    val name: MutableLiveData<String> by lazy{
        MutableLiveData("")
    }

}