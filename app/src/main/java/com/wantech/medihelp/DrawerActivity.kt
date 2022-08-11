package com.wantech.medihelp

import android.view.View
import android.widget.FrameLayout
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.ui.AppBarConfiguration
import com.google.android.material.navigation.NavigationView
import com.wantech.medihelp.databinding.ActivityDrawerBinding

open class DrawerActivity : AppCompatActivity() {
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityDrawerBinding
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var container: FrameLayout
    private lateinit var actionBarDrawerToggle: ActionBarDrawerToggle

    override fun setContentView(view: View?) {

        drawerLayout = layoutInflater.inflate(R.layout.activity_drawer, null) as DrawerLayout

        container = drawerLayout.findViewById(R.id.nav_host_fragment_content_drawer)
        container.addView(view)
        super.setContentView(drawerLayout)
        val toolbar = drawerLayout.findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val navigationView = drawerLayout.findViewById<NavigationView>(R.id.nav_view_in_drawer)
        navigationView.setNavigationItemSelectedListener {
            true
        }
        actionBarDrawerToggle =
            ActionBarDrawerToggle(
                this, drawerLayout,
                toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close,

                )
        actionBarDrawerToggle.syncState()


    }
}