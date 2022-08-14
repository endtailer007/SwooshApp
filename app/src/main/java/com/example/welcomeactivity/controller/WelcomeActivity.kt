package com.example.welcomeactivity.controller

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.example.welcomeactivity.R


class WelcomeActivity : Baseactivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome_activity)
        //val button= findViewById<Button>(R.id.getstartedbutton)
       findViewById<Button>(R.id.getstartedbutton).setOnClickListener{
            val leagueIntent=Intent(this, LeagueActivity::class.java)
           startActivity(leagueIntent)
       }













    }
}