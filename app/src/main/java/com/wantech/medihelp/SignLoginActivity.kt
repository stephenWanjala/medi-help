package com.wantech.medihelp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.wantech.medihelp.databinding.ActivitySignLoginBinding

class SignLoginActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivitySignLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navController = findNavController(R.id.nav_host_fragment_activity_sign)
        val toolbar = binding.myToolBar
//        appBarConfiguration= AppBarConfiguration(setOf(R.id.nav_signUp,R.id.nav_signIn,R.id.nav_forgotPassword))
        appBarConfiguration = AppBarConfiguration(navController.graph)
        toolbar.setNavigationIcon(R.drawable.ic_back)

        setSupportActionBar(toolbar)

        setupActionBarWithNavController(navController, appBarConfiguration)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration) ||super.onSupportNavigateUp()
    }
}