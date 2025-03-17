import SwiftUI
import Shared

class CounterState: ObservableObject, CounterViewModelState {

    @Published var counter: Int32 = 0

    func getCounter() -> Int32 {
        counter
    }

    func setCounter(number: Int32) {
        counter = number
    }
}
