import SwiftUI
import Shared

struct ContentView: View {

    @ObservedObject
    var state: CounterState
    let viewModel: ICounterViewModel

    init() {
        let state = CounterState()
        self.viewModel = CounterViewModel(state: state)
        self.state = state
    }

    var body: some View {
        VStack {
            Spacer()
            Text("\(state.counter)")
            Button("Increase") {
                viewModel.increase()
            }
            Button("Reset") {
                viewModel.reset()
            }
            Spacer()
        }
    }
}

#Preview {
    ContentView()
}
