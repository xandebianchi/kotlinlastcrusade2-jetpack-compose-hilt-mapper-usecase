package com.example.kotlinlastcrusade2.core.presentation.navigation

import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(
    val title: String,
    val icon: ImageVector,
    val route: String,
) {
    object Movie: BottomNavItem(
        title = "Movies"
        icon = Icons.,
        route =
    )
}
