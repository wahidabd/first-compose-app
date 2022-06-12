package com.wahidabd.learningjetpackcompose.ui.navig

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.wahidabd.learningjetpackcompose.ui.screeen.AccountScreen
import com.wahidabd.learningjetpackcompose.ui.screeen.FavoriteScreen
import com.wahidabd.learningjetpackcompose.ui.screeen.HomeScreen
import com.wahidabd.learningjetpackcompose.ui.screeen.ListScreen

@Composable
fun NavigationGraph(navController: NavHostController){
    NavHost(navController, startDestination = NavigationItem.Home.route) {
        composable(NavigationItem.Home.route){ HomeScreen()}
        composable(NavigationItem.List.route){ ListScreen()}
        composable(NavigationItem.Favorite.route){ FavoriteScreen() }
        composable(NavigationItem.Account.route){ AccountScreen()}
    }
}