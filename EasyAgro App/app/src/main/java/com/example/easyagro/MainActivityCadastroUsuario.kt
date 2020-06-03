package com.example.easyagro

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


import kotlinx.android.synthetic.main.activity_cadastro_usuario.*

class MainActivityCadastroUsuario : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_usuario)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

    }

     fun avancarTela(view: View) {
       val idAvancarTela = Intent(this, MainActivityInfoResidencia::class.java)
       startActivity(idAvancarTela)
     }

     fun voltarTela(view: View){
         val idVoltarTela= Intent(this, MainActivityTipoUsuario::class.java)
         startActivity(idVoltarTela)
        }

    }

