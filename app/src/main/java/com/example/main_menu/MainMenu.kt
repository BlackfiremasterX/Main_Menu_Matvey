package com.example.main_menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)


        val continue_game = findViewById<Button>(R.id.b_continue)
        continue_game.setOnClickListener{
            val perehod = Intent(this, Continue::class.java )
            startActivity(perehod)
        }

        val new_game = findViewById<Button>(R.id.b_newgame)
        new_game.setOnClickListener{
            val perehod = Intent(this, NewGame::class.java )
            startActivity(perehod)
        }

        val load_game = findViewById<Button>(R.id.b_loadgame)
        load_game.setOnClickListener{
            val perehod = Intent(this, LoadGame::class.java )
            startActivity(perehod)
        }

        val settings_game = findViewById<Button>(R.id.b_settings)
        settings_game.setOnClickListener{
            val perehod = Intent(this, Settings::class.java )
            startActivity(perehod)
        }






    }
}