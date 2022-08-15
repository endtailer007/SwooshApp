package com.example.welcomeactivity.controller
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import android.widget.ToggleButton
import androidx.core.content.ContextCompat.startActivity
import com.example.welcomeactivity.utilities.EXTRA_PLAYER
import com.example.welcomeactivity.R
import com.example.welcomeactivity.model.Player


class LeagueActivity : Baseactivity() {
    var player = Player("", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View){
        findViewById<ToggleButton>(R.id.womensLeagueBtn).isChecked=false
        findViewById<ToggleButton>(R.id.coedLeagueBtn).isChecked=false
        player.league="Mens"
    }
    fun onWomensClicked(view: View){
        findViewById<ToggleButton>(R.id.mensLeagueBtn).isChecked=false
        findViewById<ToggleButton>(R.id.coedLeagueBtn).isChecked=false
        player.league="Womens"
    }
    fun onCoedClicked(view: View){
        findViewById<ToggleButton>(R.id.womensLeagueBtn).isChecked=false
        findViewById<ToggleButton>(R.id.mensLeagueBtn).isChecked=false
        player.league="Co-ed"
    }
    fun leagueNextClicked(view:View){
        if (player.league!="") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(skillActivity)
        } else{
          Toast.makeText(this,"Please select a league",Toast.LENGTH_SHORT).show()
        }
    }

}