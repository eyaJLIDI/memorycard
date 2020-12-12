package com.example.memorycardgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_play_act_hard.*
import kotlinx.android.synthetic.main.activity_play_act_meduim.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class playActHard : AppCompatActivity() {
    private var tab: MutableList<String> = mutableListOf()
    private var tabImg: MutableList<ImageView> = mutableListOf()
    private var tabImg2: MutableList<Int> = mutableListOf()
    private var tabb: MutableList<Int> = mutableListOf()
    var tablist : MutableList<Int> = mutableListOf(0,1,2,3,4,5,6,7,8,9,10,11,0,1,2,3,4,5,6,7,8,9,10,11)
    private lateinit var scoreHARD: TextView
    private var scoreH = 0
    var c = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_act_meduim)
        var nameH = playerH
        val intent = intent
        var nameplayer = intent.getStringExtra("PLAYER_NAME")
        nameH.text = nameplayer

        var im1 = im1H
        var im2 = im2H
        var im3 = im3H
        var im4 = im4H
        var im5 = im5H
        var im6 = im6H
        var im7 = im7H
        var im8 = im8H
        var im9 = im9h
        var im10 = im10h
        var im11 = im11h
        var im12 = im12H
        var im13 = im13H
        var im14 = im14H
        var im15 = im15H
        var im16 = im16H
        var im17 = im17H
        var im18 = im18H
        var im19 = im19H
        var im20 = im20H
        var im21 = im21H
        var im22 = im22H
        var im23 = im23H
        var im24 = im24H

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



        while ( c < 24) {

            var r = (tablist).random()

            tabb.add(r)
            tablist.remove(r)

            c += 1
        }


        im1.setOnClickListener {
            val r = tabImg2[tabb[0]]
            tabImg.add(im1)
            tab.add(r.toString())
            im1.setImageResource(r)
            verifCarte()

        }
        im2.setOnClickListener {
            val r = tabImg2[tabb[1]]
            tabImg.add(im2)
            tab.add(r.toString())
            im2.setImageResource(r)
            verifCarte()
        }

        im3.setOnClickListener {
            val r = tabImg2[tabb[2]]
            tabImg.add(im3)
            tab.add(r.toString())
            im3.setImageResource(r)
            verifCarte()
        }

        im4.setOnClickListener {
            val r = tabImg2[tabb[3]]
            tabImg.add(im4)
            tab.add(r.toString())
            im4.setImageResource(r)
            verifCarte()
        }
        im5.setOnClickListener {
            val r = tabImg2[tabb[4]]
            tabImg.add(im5)
            tab.add(r.toString())
            im5.setImageResource(r)
            verifCarte()
        }
        im6.setOnClickListener {
            val r = tabImg2[tabb[6]]
            tabImg.add(im6)
            tab.add(r.toString())
            im6.setImageResource(r)
            verifCarte()
        }
        im7.setOnClickListener {
            val r = tabImg2[tabb[7]]
            tabImg.add(im7)
            tab.add(r.toString())
            im7.setImageResource(r)
            verifCarte()
        }
        im8.setOnClickListener {
            val r = tabImg2[tabb[8]]
            tabImg.add(im8)
            tab.add(r.toString())
            im8.setImageResource(r)
            verifCarte()
        }
        im9.setOnClickListener {
            val r = tabImg2[tabb[9]]
            tabImg.add(im9)
            tab.add(r.toString())
            im9.setImageResource(r)
            verifCarte()
        }
        im10.setOnClickListener {
            val r = tabImg2[tabb[10]]
            tabImg.add(im10)
            tab.add(r.toString())
            im6.setImageResource(r)
            verifCarte()
        }
        im11.setOnClickListener {
            val r = tabImg2[tabb[11]]
            tabImg.add(im11)
            tab.add(r.toString())
            im11.setImageResource(r)
            verifCarte()
        }
        im12.setOnClickListener {
            val r = tabImg2[tabb[12]]
            tabImg.add(im12)
            tab.add(r.toString())
            im12.setImageResource(r)
            verifCarte()
        }
        im13.setOnClickListener {
            val r = tabImg2[tabb[13]]
            tabImg.add(im13)
            tab.add(r.toString())
            im1.setImageResource(r)
            verifCarte()

        }
        im14.setOnClickListener {
            val r = tabImg2[tabb[14]]
            tabImg.add(im14)
            tab.add(r.toString())
            im2.setImageResource(r)
            verifCarte()
        }

        im15.setOnClickListener {
            val r = tabImg2[tabb[15]]
            tabImg.add(im15)
            tab.add(r.toString())
            im3.setImageResource(r)
            verifCarte()
        }

        im16.setOnClickListener {
            val r = tabImg2[tabb[16]]
            tabImg.add(im16)
            tab.add(r.toString())
            im4.setImageResource(r)
            verifCarte()
        }
        im17.setOnClickListener {
            val r = tabImg2[tabb[17]]
            tabImg.add(im17)
            tab.add(r.toString())
            im5.setImageResource(r)
            verifCarte()
        }
        im18.setOnClickListener {
            val r = tabImg2[tabb[18]]
            tabImg.add(im18)
            tab.add(r.toString())
            im6.setImageResource(r)
            verifCarte()
        }
        im19.setOnClickListener {
            val r = tabImg2[tabb[19]]
            tabImg.add(im19)
            tab.add(r.toString())
            im7.setImageResource(r)
            verifCarte()
        }
        im20.setOnClickListener {
            val r = tabImg2[tabb[20]]
            tabImg.add(im20)
            tab.add(r.toString())
            im8.setImageResource(r)
            verifCarte()
        }
        im21.setOnClickListener {
            val r = tabImg2[tabb[21]]
            tabImg.add(im21)
            tab.add(r.toString())
            im9.setImageResource(r)
            verifCarte()
        }
        im22.setOnClickListener {
            val r = tabImg2[tabb[22]]
            tabImg.add(im22)
            tab.add(r.toString())
            im6.setImageResource(r)
            verifCarte()
        }
        im23.setOnClickListener {
            val r = tabImg2[tabb[23]]
            tabImg.add(im23)
            tab.add(r.toString())
            im11.setImageResource(r)
            verifCarte()
        }
        im24.setOnClickListener {
            val r = tabImg2[tabb[24]]
            tabImg.add(im24)
            tab.add(r.toString())
            im12.setImageResource(r)
            verifCarte()
        }

    }
    private fun verifCarte() {
        if (tab.size == 2) {
            if (tab[0] == tab[1]) {
                scoreH += 1
                scoreHARD = scoreMedium
                scoreHARD.text = "Score += $scoreH !!"
            }
            else {
                CoroutineScope(Dispatchers.IO).launch {
                    turnCardsM()

                }
                tabImg.clear()
            }
            tab.clear()



        }

    }
    private suspend fun turnCardsM() {
        delay(3000)
        var im1 = tabImg[0]
        var im2 = tabImg[1]
        im1.setImageResource(R.drawable.what)
        im2.setImageResource(R.drawable.what)
    }
}
