package com.example.appleaday

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.appleaday.MainActivity
import com.example.appleaday.R

class splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val background = object : Thread() {
            override fun run() {
                try {
                    Thread.sleep(5000)
                    val intent = Intent(baseContext, MainActivity::class.java)
                    startActivity(intent)
                } catch (e: Exception){
                    e.printStackTrace()
                }
            }
        }
        background.start()
    }
}
