package com.example.memorycardgame

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.provider.Settings
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.annotation.RestrictTo
import androidx.appcompat.app.AppCompatActivity
import com.example.memorycardgame.R.drawable.*
import kotlinx.android.synthetic.main.activity_play_act_hard.*
import kotlinx.android.synthetic.main.activity_playactivity.*
import kotlinx.coroutines.*
import java.util.*
import android.util.Log.d as d1

class playactivity : AppCompatActivity() {
    private lateinit var returnE: ImageView
    private var tab: MutableList<String> = mutableListOf()
    private var tabImg: MutableList<ImageView> = mutableListOf()
    private var tabImg2: MutableList<Int> = mutableListOf()
    private var tabb: MutableList<Int> = mutableListOf()
    var tablist: MutableList<Int> = mutableListOf(0, 1, 2, 0, 1, 2)
    private lateinit var scoreEa: TextView
    private var scoreE = 0
    var c = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playactivity)

        val im1 = im1
        val im2 = im2
        val im3 = im3
        val im4 = im4
        val im5 = im5
        val im6 = im6


        val name = playerE
        val intent = intent
        val nameplayer = intent.getStringExtra("PLAYER_NAME")
        name.text = nameplayer
        val intentEasy = Intent(this, scoresActivity::class.java)
        intentEasy.putExtra("scoreEasy", scoreE)

        startActivity(intentEasy)

        tabImg2.add(chat)
        tabImg2.add(lion)
        tabImg2.add(chien)


        while (c < 6) {

            val r = (tablist).random()

            tabb.add(r)
            tablist.remove(r)

            c += 1
        }


        im1.setOnClickListener {
            val r = tabImg2[tabb[0]]
            tabImg.add(im1)
            tab.add(r.toString())
            im1.setImageResource(r)
            //  verifCarte()

        }
        im2.setOnClickListener {
            val r = tabImg2[tabb[1]]
            tabImg.add(im2)
            tab.add(r.toString())
            im2.setImageResource(r)
            // verifCarte()
        }

        im3.setOnClickListener {
            val r = tabImg2[tabb[2]]
            tabImg.add(im3)
            tab.add(r.toString())
            im3.setImageResource(r)
            //  verifCarte()
        }

        im4.setOnClickListener {
            val r = tabImg2[tabb[3]]
            tabImg.add(im4)
            tab.add(r.toString())
            im4.setImageResource(r)
            //  verifCarte()
        }
        im5.setOnClickListener {
            val r = tabImg2[tabb[4]]
            tabImg.add(im5)
            tab.add(r.toString())
            im5.setImageResource(r)
            // verifCarte()
        }
        im6.setOnClickListener {
            val r = tabImg2[tabb[5]]
            tabImg.add(im6)
            tab.add(r.toString())
            im6.setImageResource(r)
            // verifCarte()
        }


        returnHomeE()

    }


    /* private fun verifCarte() {
         if (tab.size == 2) {
             if (tab[0] == tab[1]) {
                 scoreE += 1
                 scoreEa = scoreEasy
                 scoreEa.text = "Score += $scoreE !!"

             }
             else {
                 GlobalScope.launch {
                     delay(3000)
                     var im1 = tabImg[0]
                     var im2 = tabImg[1]
                     im1.setImageResource(R.drawable.what)
                     im2.setImageResource(R.drawable.what)
                     tabImg.clear()
                 }
                 }

             }
             tab.clear()


         }
     }*/
    private fun returnHomeE() {
        returnE = returnHome1
        returnE.setOnClickListener {
            val intentReturn = Intent(this, MainActivity::class.java)
            startActivity(intentReturn)
        }
    }


}








