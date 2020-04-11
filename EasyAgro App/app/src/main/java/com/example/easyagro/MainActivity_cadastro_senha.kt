package com.example.easyagro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity_cadastro_senha : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_cadastro_senha)

        if(supportActionBar != null){

            supportActionBar!!.hide()
        }
    }
}
