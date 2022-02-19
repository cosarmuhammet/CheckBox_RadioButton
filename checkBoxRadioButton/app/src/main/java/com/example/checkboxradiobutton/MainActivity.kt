package com.example.checkboxradiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button = findViewById<Button>(R.id.button)
        var kirmizi = findViewById<CheckBox>(R.id.ch1)
        var mavi = findViewById<CheckBox>(R.id.ch2)
        var erkek = findViewById<RadioButton>(R.id.rd1)
        var kadin = findViewById<RadioButton>(R.id.rd2)
        button.setOnClickListener {
            kirmizi.setOnCheckedChangeListener { buttonView, isChecked ->
                if (isChecked) {
                    Toast.makeText(applicationContext, "kirmizi secildi", Toast.LENGTH_LONG).show()
                }
            }
            mavi.setOnCheckedChangeListener { buttonView, isChecked ->
                if (isChecked) {
                    Toast.makeText(applicationContext, "mavi secildi", Toast.LENGTH_LONG).show()
                }
            }
            erkek.setOnCheckedChangeListener { buttonView, isChecked ->
                if (isChecked) {
                    Toast.makeText(applicationContext, "Erkek secildi", Toast.LENGTH_LONG).show()
                }
            }
            kadin.setOnCheckedChangeListener { buttonView, isChecked ->
                if (isChecked) {
                    Toast.makeText(applicationContext, "kadin secildi", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}