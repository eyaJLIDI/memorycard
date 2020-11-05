package com.example.memorycardgame

import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class playactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playactivity)
        var name = findViewById<TextView>(R.id.player)
        val intent = intent
        var nameplayer = intent.getStringExtra("PLAYER_NAME")
        name.text = nameplayer




        var a = findViewById<ImageView>(R.id.a)
        var a2 = findViewById<ImageView>(R.id.a2)
        a.setOnClickListener {
            a.setImageResource(R.drawable.b)
            }

        a2.setOnClickListener {
                a2.setImageResource(R.drawable.aa)
            }
        a.setOnClickListener {
            a.setImageResource(R.drawable.ic_launcher_background)
        }

        }

    }
