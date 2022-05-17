package com.muradtop.kitsu.presentation.extensions

import androidx.annotation.IdRes
import androidx.navigation.NavController
import androidx.navigation.NavDirections

fun NavController.safeNavigation(@IdRes actionId: Int) {
    currentDestination?.getAction(actionId)?.let { navigate(actionId) }
}

fun NavController.directionsSafeNavigation(directions: NavDirections) {
    currentDestination?.getAction(directions.actionId)?.let { navigate(directions) }
}