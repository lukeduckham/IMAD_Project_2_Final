package com.example.imadproject2final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val StartButton = findViewById<Button>(R.id.StartButton)
        StartButton.setOnClickListener {
            val Intent = Intent(this,MollyPage2::class.java)
            startActivity(Intent)
        }}}





/* References:

    The Independent Institution of Education. (2024). Introduction to Mobile Application Development. IMAD5112. Varsity College Pietermaritzburg.
    [online] Available at: Tertiary Students - IMAD5112MM.pdf - Default View (sharepoint.com).[Accessed : 1 May 2024]

/*

 */