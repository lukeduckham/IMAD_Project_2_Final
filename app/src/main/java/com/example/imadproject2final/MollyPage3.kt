package com.example.imadproject2final

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MollyPage3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_molly_page3)


        val FeedBack = findViewById<Button>(R.id.FeedBack)
        FeedBack.setOnClickListener {
            val Intent = Intent(this, MollyPage2::class.java)
            startActivity(Intent)


        }
    }}