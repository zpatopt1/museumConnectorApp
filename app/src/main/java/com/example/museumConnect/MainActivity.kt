package com.example.museumConnect

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val reserveButton: Button = findViewById(R.id.ReserveButton)
        val exploreButton: Button = findViewById(R.id.ExploreButton)
        val QrCodeButton: Button = findViewById(R.id.QrCodeButton)

        reserveButton.setOnClickListener {
            val intent = Intent(this@MainActivity, ChoseMuseum::class.java)
            startActivity(intent)
        }

        exploreButton.setOnClickListener {
            val intent = Intent(this@MainActivity, ChoseMuseum::class.java)
            startActivity(intent)
        }

        QrCodeButton.setOnClickListener {
            val intent = Intent(this@MainActivity, ChoseMuseum::class.java)
            startActivity(intent)
        }



    }
}