package com.example.ieee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.example.ieee.Fragments.AboutFragment
import com.example.ieee.Fragments.EventFragment
import com.example.ieee.Fragments.HomeFragment
import com.example.ieee.Fragments.SIgninFragment
import com.google.android.material.navigation.NavigationView


class Navigationdrawer : AppCompatActivity() {

    lateinit var toggle : ActionBarDrawerToggle
    lateinit var drawerLayout:DrawerLayout
    lateinit var navView:NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigationdrawer)

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.mainframe, HomeFragment())
        transaction.disallowAddToBackStack()
        transaction.commit()

        drawerLayout = findViewById(R.id.drawerLayout)
        navView = findViewById(R.id.navView)

        toggle=ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
                navView.setNavigationItemSelectedListener{
                    when(it.itemId){
                        R.id.miItem1 -> {
                            Toast.makeText(applicationContext, "Clicked Item 1", Toast.LENGTH_SHORT).show()
                                val transaction = supportFragmentManager.beginTransaction()
                                    transaction.replace(R.id.mainframe, HomeFragment())
                                    transaction.disallowAddToBackStack()
                                    transaction.commit()
                        }
                        R.id.miItem2 ->  {
                            Toast.makeText(applicationContext, "Clicked Item 2", Toast.LENGTH_SHORT).show()
                            val transaction = supportFragmentManager.beginTransaction()
                            transaction.replace(R.id.mainframe, EventFragment())
                            transaction.disallowAddToBackStack()
                            transaction.commit()
                        }
                        R.id.miItem3 -> {
                            Toast.makeText(applicationContext, "Clicked Item 3", Toast.LENGTH_SHORT).show()
                            val transaction = supportFragmentManager.beginTransaction()
                            transaction.replace(R.id.mainframe, AboutFragment())
                            transaction.disallowAddToBackStack()
                            transaction.commit()
                        }
                        R.id.miItem4 -> {
                            Toast.makeText(applicationContext, "Clicked Item 4", Toast.LENGTH_SHORT).show()

                            val transaction = supportFragmentManager.beginTransaction()
                            transaction.replace(R.id.mainframe, SIgninFragment())
                            transaction.disallowAddToBackStack()
                            transaction.commit()
                        }

                    }
                true

                }
    }
            override fun onOptionsItemSelected (item : MenuItem): Boolean{
        if(toggle.onOptionsItemSelected(item)){
                    return true
                }
        return super.onOptionsItemSelected(item)
            }
}
