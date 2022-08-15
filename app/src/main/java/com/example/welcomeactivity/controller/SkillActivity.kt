package com.example.welcomeactivity.controller


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.ToggleButton
import com.example.welcomeactivity.EXTRA_PLAYER
import com.example.welcomeactivity.R
import com.example.welcomeactivity.model.Player

class SkillActivity : Baseactivity() {
    lateinit var player:Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player= intent.getParcelableExtra<Player>(EXTRA_PLAYER)!!
        println(player)
    }
    fun onBallerclicked(view:View){
        findViewById<ToggleButton>(R.id.beginnerSkillBtn).isChecked=false
        player.skill="Baller"
    }
    fun onBeginnerClicked(view: View){
        findViewById<ToggleButton>(R.id.ballerSkillBtn).isChecked=false
        player.skill="Beginner"
    }
    fun onSkillFinishClicked(view:View){
        if (player.skill!=""){
            val finishActivity=Intent(this,FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this,"Please select a skill level",Toast.LENGTH_SHORT).show()
        }
    }
}