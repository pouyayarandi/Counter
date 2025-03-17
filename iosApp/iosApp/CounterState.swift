import SwiftUI
import Shared

class CounterState: ObservableObject {
    @Published var counter: Int32 = 0
}

extension CounterState: CounterViewModelState {
    func getCounter() -> Int32 {
        counter
    }

    func setCounter(number: Int32) {
        counter = number
    }
}
