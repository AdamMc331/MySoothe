package com.adammcneilly.mysoothe

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun MySootheTextField(
    labelText: String,
    leadingIcon: ImageVector? = null,
) {
    TextField(
        value = "",
        onValueChange = { },
        label = {
            Text(labelText)
        },
        modifier = Modifier.fillMaxWidth(),
        leadingIcon = {
            if (leadingIcon != null) {
                Icon(
                    leadingIcon,
                    contentDescription = null,
                )
            }
        },
    )
}