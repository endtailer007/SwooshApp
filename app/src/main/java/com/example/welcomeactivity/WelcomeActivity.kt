package com.example.welcomeactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity


class WelcomeActivity : Baseactivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome_activity)
        //val button= findViewById<Button>(R.id.getstartedbutton)
       findViewById<Button>(R.id.getstartedbutton).setOnClickListener{
            val leagueIntent=Intent(this,LeagueActivity::class.java)
           startActivity(leagueIntent)
       }













    }
}