package com.example.myhelloworld

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //When the activity is first being created
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //How to reference button
        val button = findViewById<Button>(R.id.helloButton)
        val buttonGradient = findViewById<Button>(R.id.buttonGradient)

        button.setOnClickListener{
            Log.v("Hello World", "Button Clicked!")
            Toast.makeText(this, "Hello to you!", Toast.LENGTH_SHORT).show()
        }

        buttonGradient.setOnClickListener{
            Log.v("Button Gradient", "Color Change!")
            buttonGradient.setBackgroundColor(Color.parseColor("#F5B7BB"));

        }

    }
}