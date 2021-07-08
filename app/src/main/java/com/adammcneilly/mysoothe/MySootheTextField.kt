package com.adammcneilly.mysoothe

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MySootheTextField(
    labelText: String,
) {
    TextField(
        value = "",
        onValueChange = { },
        label = {
            Text(labelText)
        },
        modifier = Modifier.fillMaxWidth(),
    )
}