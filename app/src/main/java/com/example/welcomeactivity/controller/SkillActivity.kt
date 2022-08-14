package com.example.welcomeactivity.controller

//import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.ToggleButton
import com.example.welcomeactivity.EXTRA_LEAGUE
import com.example.welcomeactivity.EXTRA_SKILL
import com.example.welcomeactivity.R

class SkillActivity : Baseactivity() {
    private var league1=""
    private var skill=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league1=intent.getStringExtra(EXTRA_LEAGUE).toString()
        println(league1)
    }
    fun onBallerclicked(view:View){
        findViewById<ToggleButton>(R.id.beginnerSkillBtn).isChecked=false
        skill="Baller"
    }
    fun onBeginnerClicked(view: View){
        findViewById<ToggleButton>(R.id.ballerSkillBtn).isChecked=false
        skill="Beginner"
    }
    fun onSkillFinishClicked(view:View){
        if (skill!=""){
            val finishActivity=Intent(this,FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE,league1)
            finishActivity.putExtra(EXTRA_SKILL,skill)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this,"Please select a skill level",Toast.LENGTH_SHORT).show()
        }
    }
}