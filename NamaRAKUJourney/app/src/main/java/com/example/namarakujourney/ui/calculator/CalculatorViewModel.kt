package com.example.namarakujourney.ui.calculator

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculatorViewModel : ViewModel() {

    val amountOfMoney = MutableLiveData<Int>().apply {
        value = 0
    }
}