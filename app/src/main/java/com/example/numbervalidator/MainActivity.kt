package com.example.numbervalidator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById<Button>(R.id.button)
        button.setOnClickListener{handleClick()}
    }

    private fun handleClick() {
        val input1 = findViewById<EditText>(R.id.input1)
        val value1 = Integer.parseInt(input1.text.toString())
        val input2 = findViewById<EditText>(R.id.input2)
        val value2 = Integer.parseInt(input2.text.toString())

        val result: TextView = findViewById<TextView>(R.id.result)

        when {
            value1 > value2 -> {
                result.text = "O 1º valor é maior que o 2º valor"
            }
            value1 < value2 -> {
                result.text = "O 1º valor é menor que o 2º valor"
            }
            else -> {
                result.text = "O 1º valor é igual que o 2º valor"
            }
        }
    }
}