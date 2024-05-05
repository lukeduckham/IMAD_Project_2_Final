package com.example.imadproject2final

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.Toast

class MollyPage2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "ResourceType", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_molly_page2)

        //i need to declare all 3 of my buttons that will be used

        val FeedButton = findViewById<Button>(R.id.FeedButton)
        val CleanButton = findViewById<Button>(R.id.CleanButton)
        val PlayButton = findViewById<Button>(R.id.PlayButton)

// I used the setOnClickListener to activate my buttons and the code below is to have a little message to tell the person using the app that the button has been clicked

        FeedButton?.setOnClickListener {
            Toast.makeText(this@MollyPage2,
                "Feed Button clicked", Toast.LENGTH_SHORT).show()

            CleanButton?.setOnClickListener {
                Toast.makeText(this@MollyPage2,
                    "Clean Button clicked", Toast.LENGTH_SHORT).show()

                PlayButton?.setOnClickListener {
                    Toast.makeText(this@MollyPage2,
                        "Play Button clicked", Toast.LENGTH_SHORT).show()

                }
            }

                }
//Below is to bring the person to the next image once the button has been clicked
                FeedButton.setOnClickListener {
                    val Intent = Intent(this,MollyPage3::class.java)
                    startActivity(Intent)
                }

                CleanButton.setOnClickListener {
                    val Intent = Intent(this,MollyPage4::class.java)
                    startActivity(Intent)
                }

                PlayButton.setOnClickListener {
                    val  Intent = Intent(this,MollyPage5::class.java)
                    startActivity(Intent)
                }

        var HealthBar = findViewById<ProgressBar>(R.id.HealthBar)
        val progressStatus=findViewById<ProgressBar>(R.id.HealthBar)

            lateinit var ProgressBar: ProgressBar
            var health = 100 //normal health


        /* References:

        The Independent Institution of Education. (2024). Introduction to Mobile Application Development. IMAD5112. Varsity College Pietermaritzburg.
        [online] Available at: Tertiary Students - IMAD5112MM.pdf - Default View (sharepoint.com).[Accessed : 1 May 2024]


         */










    }}
