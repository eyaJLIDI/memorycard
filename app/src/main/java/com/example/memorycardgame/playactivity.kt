package com.example.memorycardgame

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.memorycardgame.R.drawable.*
import kotlinx.android.synthetic.main.activity_playactivity.*
import java.util.*


class playactivity : AppCompatActivity() {

    private var tab: MutableList<String> = mutableListOf()
    private var tabImg: MutableList<ImageView> = mutableListOf()
    private var tabImg2: MutableList<Int> = mutableListOf()

    private var scoreEas = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playactivity)
        var name = player
        var im1 = findViewById<ImageView>(R.id.im1)
        var im2 = findViewById<ImageView>(R.id.im2)
        var im3 = findViewById<ImageView>(R.id.im3)
        var im4 = findViewById<ImageView>(R.id.im4)
        var im5 = findViewById<ImageView>(R.id.im5)
        var im6 = findViewById<ImageView>(R.id.im6)

        val intent = intent
        var nameplayer = intent.getStringExtra("PLAYER_NAME")
        name.text = nameplayer

          tabImg2.add(a)
          tabImg2.add(aa)
          tabImg2.add(aaa)
          tabImg2.add(b)
        val rand = (0..5).random()
        im1.setOnClickListener {
           val r = tabImg2[rand]
            tabImg.add(im1) 
            tab.add(r.toString())
            im1.setImageResource(r)
            verifCarte()

        }

        im2.setOnClickListener {
            val r = tabImg2[rand]
            tabImg.add(im2)
            tab.add(r.toString())
            im2.setImageResource(r)
            verifCarte()
            }

        im3.setOnClickListener {
            val r = tabImg2[rand]
            tabImg.add(im3)
            tab.add(r.toString())
            im3.setImageResource(r)
            verifCarte()
        }

        im4.setOnClickListener {
            val r = tabImg2[rand]
            tabImg.add(im4)
            tab.add(r.toString())
            im4.setImageResource(r)
            verifCarte()
        }
        im5.setOnClickListener {
            val r = tabImg2[rand]
            tabImg.add(im5)
            tab.add(r.toString())
            im5.setImageResource(r)
            verifCarte()
        }
         im6.setOnClickListener {
             val r = tabImg2[rand]
             tabImg.add(im6)
             tab.add(r.toString())
             im6.setImageResource(r)
             verifCarte()
         }


    }
   /* private fun imgClick(view: View) {
        val imgSelected = view as ImageView
        var imgID = 0
        when(imgSelected.id) {
            R.id.im1 -> imgID = 1
            R.id.im2 -> imgID = 2
            R.id.im3 -> imgID = 3
            R.id.im4 -> imgID = 4
            R.id.im5 -> imgID = 5
            R.id.im6 -> imgID = 6
        }
        Toast.makeText(this, "id :" + imgID, Toast.LENGTH_LONG).show()

    }*/

    private fun verifCarte() {
        if (tab.size == 2) {
            if (tab[0] == tab[1]) {
                Log.d("test123", "pareil")
                scoreEas += 100
                scoreEasy.text = "Score += $scoreEas !!"
                var intent = Intent(this, scoresActivity::class.java)
                intent.putExtra("score", scoreEas)
               startActivity(intent)

            } else {
                Log.d("test123", "pas pareil")
                Handler().postDelayed({
                    var im1 = tabImg[0]
                    var im2 = tabImg[1]
                    im1.setImageResource(a)
                    im2.setImageResource(a)
                    tabImg.clear()
                }, 3000)

            }//id carte 1 == id carte 2
            tab.clear()

        }
    }
   /*
    private fun rand(start: Int, end: Int): Int {
        require(!(start > end || end - start + 1 > Int.MAX_VALUE)) { "Illegal Argument" }
        return Random(System.nanoTime()).nextInt(end - start + 1) + start
    } */



}


