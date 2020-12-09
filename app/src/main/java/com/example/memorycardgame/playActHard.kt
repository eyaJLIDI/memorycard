package com.example.memorycardgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class playActHard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_act_hard)
        var name = findViewById<TextView>(R.id.playerH)
        val intent = intent
        var nameplayer = intent.getStringExtra("PLAYER_NAME")
        name.text = nameplayer
    }
}