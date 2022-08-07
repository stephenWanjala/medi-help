package com.wantech.medihelp


import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.wantech.medihelp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView
        setSupportActionBar(binding.materialToolBar)

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home,
                R.id.navigation_profile,
                R.id.navigation_search,
                R.id.nav_emergency,
            )
        )

        navController = findNavController(R.id.nav_host_fragment_activity_main)

        navView.setupWithNavController(navController)
        setupActionBarWithNavController(navController, appBarConfiguration)
        if (navController.currentDestination?.id==R.id.navigation_home){
            binding.appBarLayout.visibility=View.GONE

        } else{
            binding.appBarLayout.visibility=View.VISIBLE
        }
    }



}