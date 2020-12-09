package com.example.memorycardgame

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.memorycardgame.ScoresList.UserScores
import kotlinx.android.synthetic.main.activity_playactivity.*
import kotlinx.android.synthetic.main.activity_scores.*
import kotlinx.android.synthetic.main.scoresxml.*
import kotlinx.android.synthetic.main.scoresxml.view.*
import javax.sql.DataSource

class scoresActivity : AppCompatActivity() {

     private lateinit var adapter: rvadapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scores)

        addRecord(recycScore)





    }



    fun addRecord(view: RecyclerView) {
        val intent = intent
        var name = intent.getStringExtra("name")
        var score = intent.getIntExtra("score", 0)
        user.text = name
        scores.text = score.toString()

        val databaseHandler: DataBaseHandler  = DataBaseHandler(this)
        val status = databaseHandler.addPlayer(UserScores(0,name.toString(),score))
        setupListofDataIntoRecyclerView()
    }

    private fun setupListofDataIntoRecyclerView() {

        if (getItemsList().size > 0) {

            recycScore.visibility = View.VISIBLE
            recycScore.layoutManager = LinearLayoutManager(this)
            val itemAdapter = rvadapter(this, getItemsList())
            recycScore.adapter = itemAdapter
        } else {

            recycScore.visibility = View.GONE

        }
    }

    private fun getItemsList(): ArrayList<UserScores> {

        val databaseHandler: DataBaseHandler = DataBaseHandler(this)

        val playerList: ArrayList<UserScores> = databaseHandler.viewPlayers()
        return playerList
    }

}