package com.example.memorycardgame

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_scores.*
import java.util.*
import kotlin.collections.ArrayList
import android.widget.ListAdapter as ListAdapter


class scoresActivity : AppCompatActivity() {

    private var listeScores: ArrayList<Int> = ArrayList()
    private var arrayList: ArrayList<Player> = ArrayList()
    private lateinit var listView: ListView
    private lateinit var name: String
    var adapterL: MyAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scores)

        val intentName = intent
        val playersName = intentName.getStringExtra("PLAYER_NAME")
        name = playersName.toString()
        val intentScoreE = intent
        val scoreE = intentScoreE.getIntExtra("scoreEasy", 0)
        val intentScoreM = intent
        val scoreM = intentScoreM.getIntExtra("scoreMedium", 0)
        val intentScoreH = intent
        val scoreH = intentScoreH.getIntExtra("scoreHard", 0)

        listeScores.add(scoreE)
        listeScores.add(scoreM)
        listeScores.add(scoreH)
        listView = list_view
        arrayList.add(Player(name, listeScores[0]))
        arrayList.add(Player(name, listeScores[1]))
        arrayList.add(Player(name, listeScores[2]))
        listView.adapter = adapterL
    }

}
class MyAdapter(private val context: Context, private val arrayList: java.util.ArrayList<Player>) : BaseAdapter() {
    private lateinit var name: TextView
    private lateinit var score: TextView
    override fun getCount(): Int {
        return arrayList.size
    }
    override fun getItem(position: Int): Any {
        return position
    }
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        var convertView = convertView
        convertView = LayoutInflater.from(context).inflate(R.layout.items, parent, false)
        name = convertView.findViewById(R.id.namePlayer)
        score = convertView.findViewById(R.id.scorePlayer)
        name.text = " " + arrayList[position].playerName
        score.text = arrayList[position].scores.toString()

        return convertView
    }
}