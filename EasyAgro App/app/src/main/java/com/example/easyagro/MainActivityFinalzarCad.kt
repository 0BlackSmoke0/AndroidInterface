package com.example.easyagro

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main_finalzar_cad.*

class MainActivityFinalzarCad : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_finalzar_cad)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
    }

     fun finalizarCadastro(view: View) {
        val idValidado = Intent(this, Main2Activity::class.java)
        startActivity(idValidado)
    }
}
