package com.example.memorycardgame

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_play_act_hard.*
import kotlinx.android.synthetic.main.activity_play_act_hard.*
import kotlinx.android.synthetic.main.activity_play_act_meduim.*
import kotlinx.android.synthetic.main.activity_playactivity.*
import kotlinx.coroutines.*

class playActHard : AppCompatActivity() {
    private lateinit var returnH: ImageView
    private var tab: MutableList<String> = mutableListOf()
    private var tabImg: MutableList<ImageView> = mutableListOf()
    private var tabImg2: MutableList<Int> = mutableListOf()
    private var tabb: MutableList<Int> = mutableListOf()
    var tablist : MutableList<Int> = mutableListOf(0,1,2,3,4,5,6,7,8,9,10,11,0,1,2,3,4,5,6,7,8,9,10,11)
    private lateinit var scoreHard: TextView
    private var scoreH = 0
    var c = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_act_hard)
        var nameH = playerH
        val intentH = intent
        val nameplayerH = intentH.getStringExtra("PLAYER_NAME")
        nameH.text = nameplayerH

        val intentHard = Intent(this, scoresActivity::class.java)
        intentHard.putExtra("scoreHard", scoreH)

        startActivity(intentHard)

        val im1 = im1H
        val im2 = im2H
        val im3 = im3H
        val im4 = im4H
        val im5 = im5H
        val im6 = im6H
        val im7 = im7H
        val im8 = im8H
        val im9 = im9h
        val im10 = im10h
        val im11 = im11h
        val im12 = im12H
        val im13 = im13H
        val im14 = im14H
        val im15 = im15H
        val im16 = im16H
        val im17 = im17H
        val im18 = im18H
        val im19 = im19H
        val im20 = im20H
        val im21 = im21H
        val im22 = im22H
        val im23 = im23H
        val im24 = im24H

        tabImg2.add(R.drawable.a)
        tabImg2.add(R.drawable.b)
        tabImg2.add(R.drawable.c)
        tabImg2.add(R.drawable.d)
        tabImg2.add(R.drawable.e)
        tabImg2.add(R.drawable.f)
        tabImg2.add(R.drawable.g)
        tabImg2.add(R.drawable.h)
        tabImg2.add(R.drawable.ii)
        tabImg2.add(R.drawable.j)
        tabImg2.add(R.drawable.k)
        tabImg2.add(R.drawable.l)



        while (c < 24) {

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
          //  verifCarteH()

        }
        im2.setOnClickListener {
            val r = tabImg2[tabb[1]]
            tabImg.add(im2)
            tab.add(r.toString())
            im2.setImageResource(r)
            //verifCarteH()
        }

        im3.setOnClickListener {
            val r = tabImg2[tabb[2]]
            tabImg.add(im3)
            tab.add(r.toString())
            im3.setImageResource(r)
          //  verifCarteH()
        }

        im4.setOnClickListener {
            val r = tabImg2[tabb[3]]
            tabImg.add(im4)
            tab.add(r.toString())
            im4.setImageResource(r)
           // verifCarteH()
        }
        im5.setOnClickListener {
            val r = tabImg2[tabb[4]]
            tabImg.add(im5)
            tab.add(r.toString())
            im5.setImageResource(r)
          //  verifCarteH()
        }
        im6.setOnClickListener {
            val r = tabImg2[tabb[6]]
            tabImg.add(im6)
            tab.add(r.toString())
            im6.setImageResource(r)
           // verifCarteH()
        }
        im7.setOnClickListener {
            val r = tabImg2[tabb[7]]
            tabImg.add(im7)
            tab.add(r.toString())
            im7.setImageResource(r)
          //  verifCarteH()
        }
        im8.setOnClickListener {
            val r = tabImg2[tabb[8]]
            tabImg.add(im8)
            tab.add(r.toString())
            im8.setImageResource(r)
          //  verifCarteH()
        }
        im9.setOnClickListener {
            val r = tabImg2[tabb[9]]
            tabImg.add(im9)
            tab.add(r.toString())
            im9.setImageResource(r)
          //  verifCarteH()
        }
        im10.setOnClickListener {
            val r = tabImg2[tabb[10]]
            tabImg.add(im10)
            tab.add(r.toString())
            im10.setImageResource(r)
        //    verifCarteH()
        }
        im11.setOnClickListener {
            val r = tabImg2[tabb[11]]
            tabImg.add(im11)
            tab.add(r.toString())
            im11.setImageResource(r)
           // verifCarteH()
        }
        im12.setOnClickListener {
            val r = tabImg2[tabb[12]]
            tabImg.add(im12)
            tab.add(r.toString())
            im12.setImageResource(r)
          //  verifCarteH()
        }
        im13.setOnClickListener {
            val r = tabImg2[tabb[13]]
            tabImg.add(im13)
            tab.add(r.toString())
            im13.setImageResource(r)
           // verifCarteH()

        }
        im14.setOnClickListener {
            val r = tabImg2[tabb[14]]
            tabImg.add(im14)
            tab.add(r.toString())
            im14.setImageResource(r)
          //  verifCarteH()
        }

        im15.setOnClickListener {
            val r = tabImg2[tabb[15]]
            tabImg.add(im15)
            tab.add(r.toString())
            im15.setImageResource(r)
           // verifCarteH()
        }

        im16.setOnClickListener {
            val r = tabImg2[tabb[16]]
            tabImg.add(im16)
            tab.add(r.toString())
            im16.setImageResource(r)
          //  verifCarteH()
        }
        im17.setOnClickListener {
            val r = tabImg2[tabb[17]]
            tabImg.add(im17)
            tab.add(r.toString())
            im17.setImageResource(r)
           // verifCarteH()
        }
        im18.setOnClickListener {
            val r = tabImg2[tabb[18]]
            tabImg.add(im18)
            tab.add(r.toString())
            im18.setImageResource(r)
           // verifCarteH()
        }
        im19.setOnClickListener {
            val r = tabImg2[tabb[19]]
            tabImg.add(im19)
            tab.add(r.toString())
            im19.setImageResource(r)
          //  verifCarteH()
        }
        im20.setOnClickListener {
            val r = tabImg2[tabb[20]]
            tabImg.add(im20)
            tab.add(r.toString())
            im20.setImageResource(r)
          //  verifCarteH()
        }
        im21.setOnClickListener {
            val r = tabImg2[tabb[21]]
            tabImg.add(im21)
            tab.add(r.toString())
            im21.setImageResource(r)
           // verifCarteH()
        }
        im22.setOnClickListener {
            val r = tabImg2[tabb[22]]
            tabImg.add(im22)
            tab.add(r.toString())
            im22.setImageResource(r)
           // verifCarteH()
        }
        im23.setOnClickListener {
            val r = tabImg2[tabb[23]]
            tabImg.add(im23)
            tab.add(r.toString())
            im23.setImageResource(r)
           // verifCarteH()
        }
        im24.setOnClickListener {
            val r = tabImg2[tabb[24]]
            tabImg.add(im24)
            tab.add(r.toString())
            im24.setImageResource(r)
            //verifCarteH()
        }

        returnHomeH()


    }
   /* private fun verifCarteH() {
        if (tab.size == 2) {
            if (tab[0] == tab[1]) {
                scoreH += 1
                scoreHard = scoreHARD
                scoreHard.text = "Score += $scoreH !!"
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
            tab.clear()



        }

    }*/

    private fun returnHomeH() {
        returnH = returnHome3
        returnH.setOnClickListener {
            val intentReturnH = Intent(this, MainActivity::class.java)
            startActivity(intentReturnH)
        }
    }

}
