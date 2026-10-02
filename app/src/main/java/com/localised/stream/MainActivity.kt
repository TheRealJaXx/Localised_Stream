package com.localised.stream

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(48, 48, 48, 48)
        }
        val status = TextView(this).apply {
            text = "Choose a mode"
            textSize = 22f
            gravity = Gravity.CENTER
        }
        val tx = Button(this).apply {
            text = "TX (send)"
            setOnClickListener { status.text = "TX selected" }
        }
        val rx = Button(this).apply {
            text = "RX (receive)"
            setOnClickListener { status.text = "RX selected" }
        }
        layout.addView(status)
        layout.addView(tx)
        layout.addView(rx)
        setContentView(layout)
    }
}
