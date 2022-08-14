package com.example.welcomeactivity

//import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SkillActivity : Baseactivity() {
    var league1=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league1=intent.getStringExtra(EXTRA_LEAGUE).toString()
        println(league1)
    }
}