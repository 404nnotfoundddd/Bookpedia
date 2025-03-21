package com.plcoding.bookpedia.core.presentation

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun AppTheme (
    content: @Composable () -> Unit
) {
    MaterialTheme(
        typography = Typography(),
    ) {
        content()
    }
}