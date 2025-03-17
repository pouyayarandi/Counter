package com.pyarandi

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import counter.composeapp.generated.resources.Res
import counter.composeapp.generated.resources.compose_multiplatform
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

@Composable
fun App() {
    MaterialTheme {
        val state = remember { CounterState() }
        val viewModel = remember { CounterViewModel(state) }
        val numberState = state.counter.collectAsState()
        Column(
            Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(Modifier.weight(1f))
            Text("${numberState.value}")
            Button(onClick = {
                viewModel.increase()
            }) {
                Text("Increase")
            }
            Button(onClick = {
                viewModel.reset()
            }) {
                Text("Reset")
            }
            Spacer(Modifier.weight(1f))
        }
    }
}