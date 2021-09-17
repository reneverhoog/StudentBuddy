package com.example.studentbuddy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class Splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        withHandlerRunnable(5000)
    }

    private fun gotoMain() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun withHandlerRunnable(delay: Long) {
        val runnable = Runnable {
            gotoMain()
        }
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed(runnable, delay)
    }
}
