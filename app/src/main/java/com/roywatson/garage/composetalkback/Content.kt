package com.roywatson.garage.composetalkback

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun Content() {
    var scrimVisible by remember { mutableStateOf( false ) }
    ComposeContent(
        onToggleShowSettings = { scrimVisible = !scrimVisible },
        scrimVisible,
    )
}
