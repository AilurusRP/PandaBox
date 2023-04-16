package com.example.pandabox.ui.widgets

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp

@Composable
fun ClearClipBoardButton() {
    val clipboardManager = LocalClipboardManager.current
    Button(
        onClick = {
            clipboardManager.setText(AnnotatedString(""))
        }, modifier = Modifier
            .height(50.dp)
            .width(200.dp)
    ) {
        Text("Clear Clipboard")
    }
}