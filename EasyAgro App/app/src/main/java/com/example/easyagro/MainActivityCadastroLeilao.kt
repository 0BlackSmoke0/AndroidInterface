package com.example.easyagro

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_cadastro_leilao.*

class MainActivityCadastroLeilao : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_leilao)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

    }

    fun irListaLeilao(view: View) {
        val idIrListaLeilao = Intent(this, MainActivityListaLeilao::class.java)
        startActivity(idIrListaLeilao)
    }

    fun irGraficoleilao(view: View){
        val mensagem1 = "Tela em construção..."
        Toast.makeText(this, mensagem1, Toast.LENGTH_LONG).show()
    }

    fun btCadastrarLeilao(view: View){
        val cadastrarLeilao = Intent(this, MainActivityListaLeilao::class.java)
        val mensagem1 = "Leilão Cadastrado!"
        Toast.makeText(this, mensagem1, Toast.LENGTH_LONG).show()
        startActivity(cadastrarLeilao)
    }

    fun btCancelarLeilao(view: View){
        val cancelarLeilao = Intent(this, MainActivity::class.java)
        val mensagem1 = "Leilão Cancelado!"
        Toast.makeText(this, mensagem1, Toast.LENGTH_LONG).show()
        startActivity(cancelarLeilao)
    }



}
