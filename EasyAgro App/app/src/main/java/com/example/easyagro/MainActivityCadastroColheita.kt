package com.example.easyagro

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.easyagro.R
import kotlinx.android.synthetic.main.activity_cadastro_colheita.*

class MainActivityCadastroColheita : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_colheita)

        if (supportActionBar != null) {

            supportActionBar!!.hide()
        }

    }

    fun irListaColheita(view: View) {
        val listaDeColheita = Intent(this, MainActivityListaColheita::class.java)
        startActivity(listaDeColheita)
    }

    fun irGraficosColheita(view: View){
        val mensagem1 = "Tela em construção..."
        Toast.makeText(this, mensagem1, Toast.LENGTH_LONG).show()

    }

    fun btCadastrarColheita(view: View){
        val mensagem1 = "Colheita cadastrada com sucesso!"
        Toast.makeText(this, mensagem1, Toast.LENGTH_LONG).show()

    }

    fun btCancelarCadastroDeColheita(view: View){

        val mensagem1 = "Cadastro de colheita cancelado!"
        Toast.makeText(this, mensagem1, Toast.LENGTH_LONG).show()

    }


}
