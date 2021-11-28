package com.example.fragmenfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navView = findViewById<BottomNavigationView>(R.id.bottomNavMenu)

        val controller = findNavController(R.id.nav_host_fragment)

        val appBarCovfig = AppBarConfiguration(
            setOf(

                R.id.homeFragment, R.id.dashboardFragment,
                R.id.notificationFragment, R.id.favoriteFragment

            )
        )

        setupActionBarWithNavController(controller, appBarCovfig)
        navView.setupWithNavController(controller)
    }
}