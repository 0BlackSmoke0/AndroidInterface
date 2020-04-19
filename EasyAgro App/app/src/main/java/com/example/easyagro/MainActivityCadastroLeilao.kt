package com.example.easyagro

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivityCadastroLeilao : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_leilao)

        if (supportActionBar != null) {

            supportActionBar!!.hide()
        }
    }
}
