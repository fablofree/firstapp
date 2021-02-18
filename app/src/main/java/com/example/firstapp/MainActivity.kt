package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.text_view)
    }

    fun clickPress(view: View){

        textView.visibility =View.VISIBLE
//        val textViewText = textView.text.toString()
//        val button = view as Button
//        val buttonText = button.text.toString()
//        textView.text = buttonText
//        Log.d("MainActivity", textViewText)
//        Log.d("MainActivity", textView.toString())
    }
}