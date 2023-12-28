package com.novelitech.portfoliosimplekotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var buttonSkills: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSkills = findViewById(R.id.buttonSkills)

        buttonSkills.setOnClickListener {
            intent = Intent(this, SkillsActivity::class.java)

            startActivity(intent)
        }

    }
}