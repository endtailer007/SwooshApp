package com.example.welcomeactivity.controller
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.ToggleButton
import com.example.welcomeactivity.EXTRA_LEAGUE
import com.example.welcomeactivity.R

class LeagueActivity : Baseactivity() {
    var selectedLeague=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }
    fun onMensClicked(view: View){
        findViewById<ToggleButton>(R.id.womensLeagueBtn).isChecked=false
        findViewById<ToggleButton>(R.id.coedLeagueBtn).isChecked=false
        selectedLeague="Mens"
    }
    fun onWomensClicked(view: View){
        findViewById<ToggleButton>(R.id.mensLeagueBtn).isChecked=false
        findViewById<ToggleButton>(R.id.coedLeagueBtn).isChecked=false
        selectedLeague="Womens"
    }
    fun onCoedClicked(view: View){
        findViewById<ToggleButton>(R.id.womensLeagueBtn).isChecked=false
        findViewById<ToggleButton>(R.id.mensLeagueBtn).isChecked=false
        selectedLeague="Co-ed"
    }
    fun leagueNextClicked(view:View){
        if (selectedLeague!="") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE,selectedLeague)
            startActivity(skillActivity)
        } else{
          Toast.makeText(this,"Please select a league",Toast.LENGTH_SHORT).show()
        }
    }

}