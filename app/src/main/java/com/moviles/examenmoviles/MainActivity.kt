package com.moviles.examenmoviles

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.moviles.examenmoviles.data.mockSpaces
import com.moviles.examenmoviles.ui.screens.SpaceDetailScreen
import com.moviles.examenmoviles.ui.screens.SpaceListScreen
import com.moviles.examenmoviles.ui.theme.ExamenMovilesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExamenMovilesTheme {
                AppNavigation()
            }
        }
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "space_list"
    ) {
        composable("space_list") {
            SpaceListScreen { space ->
                navController.navigate("space_detail/${space.id}")
            }
        }
        composable(
            route = "space_detail/{spaceId}",
            arguments = listOf(navArgument("spaceId") { type = NavType.IntType })
        ) { backStackEntry ->
            val spaceId = backStackEntry.arguments?.getInt("spaceId")
            val space = mockSpaces.find { it.id == spaceId }
            if (space != null) {
                SpaceDetailScreen(
                    space = space,
                    onBack = { navController.popBackStack() }
                )
            }
        }
    }
}
