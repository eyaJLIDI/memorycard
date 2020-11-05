package com.example.memorycardgame


import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList
import android.widget.AdapterView as AdapterView1


class MainActivity : AppCompatActivity() {
    private lateinit var option: Spinner
    private lateinit var play: Button
    private lateinit var playersname: String
    private lateinit var levelSelected: Level
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // open play activity
        openPlayAct()
        // open settings
        //openSetting()


    }

    //__________________________________________________________
    private fun openPlayAct() {
        option = findViewById(R.id.levels)
        val levelList: MutableList<Level> = ArrayList()
        val level1 = Level("easy")
        levelList.add(level1)
        val level2 = Level("medium")
        levelList.add(level2)
        val level3 = Level("hard")
        levelList.add(level3)
        val adapter: ArrayAdapter<Level> = ArrayAdapter<Level>(
                this, android.R.layout.simple_spinner_item, levelList
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        option.setAdapter(adapter)
        option.onItemSelectedListener = object : android.widget.AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: android.widget.AdapterView<*>?) {
            }

            override fun onItemSelected(adapterView: AdapterView1<*>?, view: View?, position: Int, id: Long) {

                val level: Level = option.selectedItem as Level
                levelSelected = level
                Toast.makeText(this@MainActivity, "you selected the level ${adapterView?.getItemAtPosition(position).toString()}", Toast.LENGTH_LONG).show()


            }
        }

        playersname = userName.text.toString()

        play = findViewById<Button>(R.id.play)
        play.setOnClickListener {
            when (levelSelected.level) {
                "easy" -> {
                    var intentplay = Intent(this, playactivity::class.java)
                    Log.d("jjee", playersname)
                    intentplay.putExtra("PLAYER_NAME", playersname)
                    startActivity(intentplay)
                }

                "medium" -> {
                    var intentplay = Intent(this, playActMeduim::class.java)
                    intentplay.putExtra("player's name", playersname)
                    startActivity(intentplay)
                }
                "hard" -> {
                    var intentplay = Intent(this, playActHard::class.java)
                    intentplay.putExtra("player's name", playersname)
                    startActivity(intentplay)
                }
                else -> Toast.makeText(this, "pick a level", Toast.LENGTH_LONG).show()
            }


        }

    }
}
    //________________________________________________________________
   /* private fun openSetting() {
        var sett = findViewById<ImageButton>(R.id.setting)
        sett.setOnClickListener {
            showChangeLang()
        }
    }
    //_____________________________________________________________
   /* fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView: View = inflater.inflate(R.layout.subscpopup, container, false)

        return rootView
    }*/
    private fun showChangeLang() {

        val listItmes = arrayOf("English","frensh","عربي")

        val mBuilder = AlertDialog.Builder(this@MainActivity)
        mBuilder.setTitle("Choose Language")
        mBuilder.setSingleChoiceItems(listItmes, -1) { dialog, which ->
            if (which == 0) {
                setLocate("en")
                recreate()
            } else if (which == 1) {
                setLocate("fr")
                recreate()
            } else if (which == 2) {
                setLocate("ar")
                recreate()
            }

            dialog.dismiss()
        }
        val mDialog = mBuilder.create()

        mDialog.show()

    }

    private fun setLocate(Lang: String) {

        val locale = Locale(Lang)

        Locale.setDefault(locale)

        val config = Configuration()

        config.locale = locale
        baseContext.resources.updateConfiguration(config, baseContext.resources.displayMetrics)

        val editor = getSharedPreferences("Settings", Context.MODE_PRIVATE).edit()
        editor.putString("My_Lang", Lang)
        editor.apply()
    }

    private fun loadLocate() {
        val sharedPreferences = getSharedPreferences("Settings", Activity.MODE_PRIVATE)
        val language = sharedPreferences.getString("My_Lang", "")
        language?.let { setLocate(it) }
    }*/
    //________________________________________________________________________________________


