package com.wahidabd.learningjetpackcompose.ui.navig

import com.wahidabd.learningjetpackcompose.R

sealed class NavigationItem(var route: String, var icon: Int, var title: String){
    object Home : NavigationItem("home", R.drawable.ic_outline_home_24, "Home")
    object List : NavigationItem("list", R.drawable.ic_outline_format_list_bulleted_24, "List")
    object Favorite : NavigationItem("favorite", R.drawable.ic_baseline_favorite_border_24, "Favorite")
    object Account : NavigationItem("account", R.drawable.ic_outline_account_circle_24, "Account")
}