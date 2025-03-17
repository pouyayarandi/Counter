package com.pyarandi

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class CounterState: CounterViewModelState {

    private val _counter = MutableStateFlow<Int>(0)
    var counter = _counter.asStateFlow()

    override fun getCounter(): Int {
        return counter.value
    }

    override fun setCounter(number: Int) {
        _counter.value = number
    }
}