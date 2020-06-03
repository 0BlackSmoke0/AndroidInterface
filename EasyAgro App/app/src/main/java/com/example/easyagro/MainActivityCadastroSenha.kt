package com.example.easyagro

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main_cadastro_senha.*

class MainActivityCadastroSenha : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_cadastro_senha)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

    }

    fun finalizarCadastroUser(view: View) {
        val idValidar = Intent(this, MainActivityFinalzarCad::class.java)
        startActivity(idValidar)
    }

}
