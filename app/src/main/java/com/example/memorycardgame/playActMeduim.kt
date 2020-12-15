package com.example.memorycardgame

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_play_act_meduim.*
import kotlinx.android.synthetic.main.activity_playactivity.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class playActMeduim : AppCompatActivity() {
    private lateinit var returnM: ImageView
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
        val name = playerM
        val intent = intent
        val nameplayer = intent.getStringExtra("PLAYER_NAME")
        name.text = nameplayer

        val intentMedium = Intent(this, scoresActivity::class.java)
        intentMedium.putExtra("scoreMedium", scoreM)

        startActivity(intentMedium)

        val im1 = im1M
        val im2 = im2M
        val im3 = im3M
        val im4 = im4M
        val im5 = im5M
        val im6 = im6M
        val im7 = im7M
        val im8 = im8M
        val im9 = im9M
        val im10 = im10M
        val im11 = im11M
        val im12 = im12M

        tabImg2.add(R.drawable.carotte)
        tabImg2.add(R.drawable.tomate)
        tabImg2.add(R.drawable.salade)
        tabImg2.add(R.drawable.aubergine)
        tabImg2.add(R.drawable.poivron)
        tabImg2.add(R.drawable.brocoli)


        while ( c < 12) {
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
           //  verifCarteM()

        }
        im2.setOnClickListener {
            val r = tabImg2[tabb[1]]
            tabImg.add(im2)
            tab.add(r.toString())
            im2.setImageResource(r)
            // verifCarteM()
        }

        im3.setOnClickListener {
            val r = tabImg2[tabb[2]]
            tabImg.add(im3)
            tab.add(r.toString())
            im3.setImageResource(r)
           // verifCarteM()
        }

        im4.setOnClickListener {
            val r = tabImg2[tabb[3]]
            tabImg.add(im4)
            tab.add(r.toString())
            im4.setImageResource(r)
           // verifCarteM()
        }
        im5.setOnClickListener {
            val r = tabImg2[tabb[4]]
            tabImg.add(im5)
            tab.add(r.toString())
            im5.setImageResource(r)
            // verifCarteM()
        }
        im6.setOnClickListener {
            val r = tabImg2[tabb[5]]
            tabImg.add(im6)
            tab.add(r.toString())
            im6.setImageResource(r)
            // verifCarteM()
        }
        im7.setOnClickListener {
            val r = tabImg2[tabb[6]]
            tabImg.add(im7)
            tab.add(r.toString())
            im7.setImageResource(r)
            // verifCarteM()
        }
        im8.setOnClickListener {
            val r = tabImg2[tabb[7]]
            tabImg.add(im8)
            tab.add(r.toString())
            im8.setImageResource(r)
             // verifCarteM()
        }
        im9.setOnClickListener {
            val r = tabImg2[tabb[8]]
            tabImg.add(im9)
            tab.add(r.toString())
            im9.setImageResource(r)
           // verifCarteM()
      }
        im10.setOnClickListener {
            val r = tabImg2[tabb[9]]
            tabImg.add(im10)
            tab.add(r.toString())
            im10.setImageResource(r)
            //  verifCarteM()
        }
        im11.setOnClickListener {
            val r = tabImg2[tabb[10]]
            tabImg.add(im11)
            tab.add(r.toString())
            im11.setImageResource(r)
            //  verifCarteM()
        }
        im12.setOnClickListener {
            val r = tabImg2[tabb[11]]
            tabImg.add(im12)
            tab.add(r.toString())
            im12.setImageResource(r)
            //  verifCarteM()
        }

        returnHomeM()

    }
   /* private fun verifCarteM() {
        if (tab.size == 2) {
            if (tab[0] == tab[1]) {
                scoreM += 1
                scoreMEDIUM = scoreMedium
                scoreMEDIUM.text = "Score += $scoreM !!"
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


   private fun returnHomeM() {
       returnM = returnHome2
       returnM.setOnClickListener {
           val intentReturnM = Intent(this, MainActivity::class.java)
           startActivity(intentReturnM)
       }
    }
}
