package com.example.firstappcube_Pogorelov_Golubev

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
            /*val button: Button = findViewById(R.id.button)
            val resultText: TextView = findViewById(R.id.resultText)

            button.setOnClickListener {
                // Генерируем случайное число от 1 до 6
                val randomNumber = (1..6).random()
                // Выводим его в TextView
                resultText.text = randomNumber.toString()
            }*/
        }
    }
}