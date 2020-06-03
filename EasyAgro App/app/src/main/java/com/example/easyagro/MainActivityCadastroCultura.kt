package com.example.easyagro


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_cadastro_cultura.*

class MainActivityCadastroCultura : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_cultura)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
    }

    fun  irListaCultura(view: View) {
        val idIrListaCultura = Intent(this, MainActivityListaCultura::class.java)
        startActivity(idIrListaCultura)

        }

    fun irGraficoCultura(view: View){
        val mensagem1 = "Tela em construção..."
        Toast.makeText(this, mensagem1, Toast.LENGTH_LONG).show()

    }

    fun btCadastrarCultura(view: View){
        val mensagem1 = "Cultura Cadastrada!"
        Toast.makeText(this, mensagem1, Toast.LENGTH_LONG).show()

    }

    fun btCancelarCultura(view: View){
        val mensagem1 = "Cultura Cancelada!"
        Toast.makeText(this, mensagem1, Toast.LENGTH_LONG).show()

    }
}