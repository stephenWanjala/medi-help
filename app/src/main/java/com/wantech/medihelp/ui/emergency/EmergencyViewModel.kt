package com.wantech.medihelp.ui.emergency

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EmergencyViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is emergency Fragment"
    }
    val text: LiveData<String> = _text
}