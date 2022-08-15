package com.example.welcomeactivity.controller

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import com.example.welcomeactivity.utilities.EXTRA_PLAYER
import com.example.welcomeactivity.R
import com.example.welcomeactivity.model.Player


class FinishActivity : Baseactivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val player=intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        findViewById<TextView>(R.id.searchLeagueText).text="Looking for ${player?.league}${player?.skill} league near you...."
    }
}