package com.novelitech.portfoliosimplekotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var buttonSkills: Button
    private lateinit var buttonEducation: Button
    private lateinit var buttonWork: Button
    private lateinit var buttonAchievements: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSkills = findViewById(R.id.buttonSkills)
        buttonEducation = findViewById(R.id.buttonEducation)
        buttonWork = findViewById(R.id.buttonWork)
        buttonAchievements = findViewById(R.id.buttonAchievements)

        buttonSkills.setOnClickListener { goTo(SkillsActivity()) }
        buttonEducation.setOnClickListener { goTo(EducationActivity()) }
        buttonWork.setOnClickListener { goTo(WorkActivity()) }
        buttonAchievements.setOnClickListener { goTo(AchievementsActivity()) }

    }

    private fun goTo(activity: AppCompatActivity) {
        intent = Intent(this, activity::class.java)

        startActivity(intent)
    }
}