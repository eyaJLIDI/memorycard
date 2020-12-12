package com.example.memorycardgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_scores.*

class scoresActivity : AppCompatActivity() {
    private lateinit var scoreEasy : TextView
    private lateinit var playername : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scores)

        scoreEasy = scoreEasyTV
        val intent = intent
        var scoreE = intent.getIntExtra("scoreEasy", 0)
        scoreEasy.text = scoreE.toString()
        Log.d("tst3", "marche")

       /* playername = playernameTV
        val intentN = intent
        var pname = intentN.getStringExtra("name")
        playername.text = pname
        Log.d("tst2", "marche")*/
    }
}