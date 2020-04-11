package com.example.easyagro

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_cadastro_usuario.*

class MainActivityCadastroUsuario : AppCompatActivity(),  View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_usuario)

        if(supportActionBar != null){
            supportActionBar!!.hide()
        }

        bt_avancatela.setOnClickListener(this)
        bt_voltartela.setOnClickListener(this)

    }

    override fun onClick(view: View) {

        val idVol = view.id
        if (idVol == R.id.bt_voltartela){
            handleSaveVol()
        }

        val idAva = view.id
        if (idAva == R.id.bt_avancatela){
            handleSaveAva()
        }
    }

    private fun handleSaveAva(){

        //Main Activity estão trocadas (Voltar)
        startActivity(Intent(this, MainActivityTipoUsuario::class.java))
    }

    private fun handleSaveVol(){

        //Main Activity estão trocadas (Avançar)
        startActivity(Intent(this, MainActivityInfoResidencia::class.java))
    }
}
