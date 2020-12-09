package com.example.memorycardgame

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.memorycardgame.ScoresList.UserScores
import kotlinx.android.synthetic.main.scoresxml.view.*

class rvadapter(val context: Context, val items: ArrayList<UserScores>) :

        RecyclerView.Adapter<rvadapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
                LayoutInflater.from(context).inflate(
                        R.layout.scoresxml,
                        parent,
                        false
                )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = items[position]
        holder.name.text = item.playerName
        holder.score.text = item.scores.toString()

    }


    override fun getItemCount(): Int {
        return items.size
    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        // Holds the TextView that will add each item to
        val name: TextView = view.user
        val score: TextView = view.scores

    }
}