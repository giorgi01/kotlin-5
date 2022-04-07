package com.example.task5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button2)
        btn.setOnClickListener{
            Toast.makeText(this@MainActivity, "You clicked me:)", Toast.LENGTH_SHORT).show()
        }
    }
}