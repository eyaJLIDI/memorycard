package com.example.memorycardgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class playActMeduim : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_act_meduim)
        var name = findViewById<TextView>(R.id.playerM)
        val intent = intent
        var nameplayer = intent.getStringExtra("PLAYER_NAME")
        name.text = nameplayer
    }
}