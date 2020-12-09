package com.example.memorycardgame

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.SQLException
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.memorycardgame.ScoresList.UserScores

class DataBaseHandler(context: Context): SQLiteOpenHelper(context,DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_VERSION = 1
        private const val DATABASE_NAME = "MemoryGameDataBase"
        private const val TABLE_PLAYERS = "playerName"

        private const val KEY_ID = "_id"
        private const val KEY_NAME = "name"
        private const val Key_SCORE = "score"
        //private const val KEY_TIME = "time"

    }

    override fun onCreate(db: SQLiteDatabase?) {
        //creating table with fields
        val CREATE_PLAYERS_TABLE = ("CREATE TABLE" + TABLE_PLAYERS + "(" + KEY_ID + "INTEGER PRIMARY KEY," + KEY_NAME + "TEXT," + Key_SCORE + "TEXT," + ")")
        db?.execSQL(CREATE_PLAYERS_TABLE)
    }
    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db!!.execSQL("DROP TABLE IF EXISTS $TABLE_PLAYERS")
        onCreate(db)
    }

    fun addPlayer(player: UserScores): Long {
        val db = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(KEY_NAME, player.playerName)
        contentValues.put(Key_SCORE, player.scores)
       // contentValues.put(Key_TIME, player.time)
        val success = db.insert(TABLE_PLAYERS, null, contentValues)
        db.close()
        return success
    }

    fun viewPlayers(): ArrayList<UserScores> {
        val playerList: ArrayList<UserScores> = ArrayList<UserScores>()
        val selectQuery = "SELECT * FROM $TABLE_PLAYERS"
        val db = this.readableDatabase
        var cursor: Cursor ? = null
        try {
            cursor = db.rawQuery(selectQuery, null)
        }catch (e: SQLException) {
            db.execSQL(selectQuery)
            return ArrayList()
        }
        var id : Int
        var name : String
        var score : Int
        //var time : Int
        if(cursor.moveToFirst()){
            do {
                id = cursor.getInt(cursor.getColumnIndex(KEY_ID))
                name = cursor.getString(cursor.getColumnIndex(KEY_NAME))
                score = cursor.getInt(cursor.getColumnIndex(Key_SCORE))
                //time = cursor.getInt(cursor.getColumnIndex(Key_TIME))

                val p = UserScores(id = id, playerName = name, scores = score)
                playerList.add(p)

            }while (cursor.moveToNext())

        }

        return playerList
    }

}