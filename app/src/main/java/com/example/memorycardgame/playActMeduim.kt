package com.example.memorycardgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_play_act_meduim.*
import kotlinx.android.synthetic.main.activity_playactivity.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class playActMeduim : AppCompatActivity() {
    private var tab: MutableList<String> = mutableListOf()
    private var tabImg: MutableList<ImageView> = mutableListOf()
    private var tabImg2: MutableList<Int> = mutableListOf()
    private var tabb: MutableList<Int> = mutableListOf()
    var tablist : MutableList<Int> = mutableListOf(0,1,2,3,4,5,0,1,2,3,4,5)
    private lateinit var scoreMEDIUM: TextView
    private var scoreM = 0
    var c = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_act_meduim)
        var name = playerM
        val intent = intent
        var nameplayer = intent.getStringExtra("PLAYER_NAME")
        name.text = nameplayer

        var im1 = im1M
        var im2 = im2M
        var im3 = im3M
        var im4 = im4M
        var im5 = im5M
        var im6 = im6M
        var im7 = im7M
        var im8 = im8M
        var im9 = im9M
        var im10 = im10M
        var im11 = im11M
        var im12 = im12M

        tabImg2.add(R.drawable.carotte)
        tabImg2.add(R.drawable.tomate)
        tabImg2.add(R.drawable.salade)
        tabImg2.add(R.drawable.aubergine)
        tabImg2.add(R.drawable.poivron)
        tabImg2.add(R.drawable.brocoli)


        while ( c < 12) {

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
            val r = tabImg2[tabb[5]]
            tabImg.add(im6)
            tab.add(r.toString())
            im6.setImageResource(r)
             verifCarte()
        }
        im7.setOnClickListener {
            val r = tabImg2[tabb[6]]
            tabImg.add(im7)
            tab.add(r.toString())
            im7.setImageResource(r)
             verifCarte()
        }
        im8.setOnClickListener {
            val r = tabImg2[tabb[7]]
            tabImg.add(im8)
            tab.add(r.toString())
            im8.setImageResource(r)
              verifCarte()
        }
        im9.setOnClickListener {
            val r = tabImg2[tabb[8]]
            tabImg.add(im9)
            tab.add(r.toString())
            im9.setImageResource(r)
              verifCarte()
        }
        im10.setOnClickListener {
            val r = tabImg2[tabb[9]]
            tabImg.add(im10)
            tab.add(r.toString())
            im6.setImageResource(r)
              verifCarte()
        }
        im11.setOnClickListener {
            val r = tabImg2[tabb[10]]
            tabImg.add(im11)
            tab.add(r.toString())
            im11.setImageResource(r)
              verifCarte()
        }
        im12.setOnClickListener {
            val r = tabImg2[tabb[11]]
            tabImg.add(im12)
            tab.add(r.toString())
            im12.setImageResource(r)
              verifCarte()
        }

    }
    private fun verifCarte() {
        if (tab.size == 2) {
            if (tab[0] == tab[1]) {
                scoreM += 1
                scoreMEDIUM = scoreMedium
                scoreMEDIUM.text = "Score += $scoreM !!"
            }
            else {
               CoroutineScope(IO).launch {
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
