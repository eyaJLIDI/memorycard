package com.example.memorycardgame

data class UserScores(
    var id : Int,
    var playerName : String,
    var scores  : Int
    // var time : Int
) {
    override fun toString(): String {
        return "id=$id, playerName='$playerName', scores=$scores"
    }
}