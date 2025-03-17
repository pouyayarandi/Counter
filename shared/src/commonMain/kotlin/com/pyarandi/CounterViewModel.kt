package com.pyarandi

interface ICounterViewModel {
    fun increase()
    fun reset()
}

class CounterViewModel(
    private val state: CounterViewModelState,
): ICounterViewModel {

    private var counter: Int
        get() = state.getCounter()
        set(value) = state.setCounter(value)

    override fun increase() {
        counter++
    }

    override fun reset() {
        counter = 0
    }
}