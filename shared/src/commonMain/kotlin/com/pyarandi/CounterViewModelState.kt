package com.pyarandi

interface CounterViewModelState {
    fun getCounter(): Int
    fun setCounter(number: Int)
}