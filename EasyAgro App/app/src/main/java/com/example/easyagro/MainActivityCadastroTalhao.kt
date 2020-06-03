package com.example.easyagro

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_cadastro_talhao.*

class MainActivityCadastroTalhao : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_talhao)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
    }

     fun irListaTalhao(view: View) {
         val idIrListaTalhao = Intent(this, MainActivityListaTalhao::class.java)
         startActivity(idIrListaTalhao)
    }

    fun irGraficosTalhao(view: View){
        val mensagem1 = "Tela em construção..."
        Toast.makeText(this, mensagem1, Toast.LENGTH_LONG).show()
    }

    fun btCadastrarTalhao(view: View){
        val mensagem1 = "Talhão Cadastrado!"
        Toast.makeText(this, mensagem1, Toast.LENGTH_LONG).show()
    }

    fun btCancelarTalhao(view: View){
        val mensagem1 = "Talhão Cancelado!"
        Toast.makeText(this, mensagem1, Toast.LENGTH_LONG).show()
    }
}
