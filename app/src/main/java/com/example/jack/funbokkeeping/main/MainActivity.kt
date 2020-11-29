package com.example.jack.funbokkeeping.main

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.ui.setupWithNavController
import com.example.jack.funbokkeeping.R
import com.example.jack.funbokkeeping.extensions.findNavHostFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener,
    NavController.OnDestinationChangedListener {

    private lateinit var navController: NavController
    private var lastNavigationItemId = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        initParam()
    }

    private fun initView() {
        val navHostFragment =
            supportFragmentManager.findNavHostFragment(R.id.fragmentContainerMainView)
        navController = navHostFragment.navController
        bottomNavigationMainView.setupWithNavController(navController)
        bottomNavigationMainView.itemIconTintList = null
        navController.addOnDestinationChangedListener(this)
    }

    private fun initParam() {
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val itemId = item.itemId
        return if (itemId != lastNavigationItemId) {
            navController.navigate(itemId)
            lastNavigationItemId = itemId
            true
        } else {
            false
        }
    }

    override fun onDestinationChanged(
        controller: NavController,
        destination: NavDestination,
        arguments: Bundle?
    ) {
    }
}
