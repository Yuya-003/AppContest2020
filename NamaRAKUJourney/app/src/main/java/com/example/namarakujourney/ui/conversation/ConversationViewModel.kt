package com.example.namarakujourney.ui.conversation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ConversationViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is conversation Fragment"
    }
    val text: LiveData<String> = _text
}