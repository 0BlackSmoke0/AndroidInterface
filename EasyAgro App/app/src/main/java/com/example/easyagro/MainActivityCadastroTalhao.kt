package com.example.easyagro

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivityCadastroTalhao : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_talhao)

        if (supportActionBar != null) {

            supportActionBar!!.hide()
        }
    }
}
