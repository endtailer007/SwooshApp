package com.example.welcomeactivity.controller

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import com.example.welcomeactivity.EXTRA_LEAGUE
import com.example.welcomeactivity.EXTRA_SKILL
import com.example.welcomeactivity.R

class FinishActivity : Baseactivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val league=intent.getStringExtra(EXTRA_LEAGUE)
        val skill=intent.getStringExtra(EXTRA_SKILL)
        findViewById<TextView>(R.id.searchLeagueText).text="Looking for $league $skill league near you...."
    }
}