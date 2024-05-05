package com.example.imadproject2final

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PlayMolly5 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_molly5)

        val FunButton = findViewById<Button>(R.id.FunButton)
        FunButton.setOnClickListener {
            val Intent = Intent(this, MollyPage2::class.java)
            startActivity(Intent)
    }
}}