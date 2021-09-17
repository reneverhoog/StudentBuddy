package com.example.studentbuddy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.toolbar))

        val drawer = findViewById<DrawerLayout>(R.id.drawer)
        val drawerToggle = ActionBarDrawerToggle(this, drawer, R.string.open, R.string.close)
        drawer.addDrawerListener(drawerToggle)
        drawerToggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val Screen_1 = findViewById<Button>(R.id.screen1)
        Screen_1.setOnClickListener{
            val intent = Intent(this, Screen1::class.java)
            startActivity(intent)
        }

        val Screen_2 = findViewById<Button>(R.id.screen2)
        Screen_2.setOnClickListener{
            val intent = Intent(this, Screen2::class.java)
            startActivity(intent)
        }

        val Screen_3 = findViewById<Button>(R.id.screen3)
        Screen_3.setOnClickListener{
            val intent = Intent(this, Screen3::class.java)
            startActivity(intent)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                val drawer = findViewById<DrawerLayout>(R.id.drawer)
                drawer.openDrawer(GravityCompat.START)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}

