package com.example.beritamobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.beritamobile.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

//    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        binding = ActivityMainBinding.inflate(layoutInflater)


//        val navView: BottomNavigationView = binding.bottomBar
//        val navController = findNavController(R.id.fragmentContainerView)
//        navView.setupWithNavController(navController)

//        val navBottomMenu:BottomNavigationView = binding.bottomBar
//        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navigation) as NavHostFragment
//        val navController = navHostFragment.navController

//        navBottomMenu.setupWithNavController(navController)
    }
}