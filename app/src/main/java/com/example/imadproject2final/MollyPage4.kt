package com.example.imadproject2final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import android.widget.Toast

class MollyPage4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_molly_page4)

        val BackButton1 = findViewById<Button>(R.id.BackButton1)
        BackButton1.setOnClickListener {
            val Intent = Intent(this, MollyPage2::class.java)
            startActivity(Intent)

            val progressBar = findViewById<ProgressBar>(R.id.progressBar)


            }


        }
    }
