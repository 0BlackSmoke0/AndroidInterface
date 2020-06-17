package com.example.easyagro.Talhao

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.easyagro.MenuPrincipal.MainActivity
import com.example.easyagro.R

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
        val irGraphTalhao = Intent(this, MainActivityGraficoTalhao::class.java)
        startActivity(irGraphTalhao)
    }

    fun btCadastrarTalhao(view: View){
        val cadastrarTalhao = Intent(this, MainActivityListaTalhao::class.java)
        val mensagem1 = "Talhão Cadastrado!"
        Toast.makeText(this, mensagem1, Toast.LENGTH_LONG).show()
        startActivity(cadastrarTalhao)
    }

    fun btCancelarTalhao(view: View){
        val cancelarTalhao = Intent(this, MainActivity::class.java)
        val mensagem1 = "Talhão Cancelado!"
        Toast.makeText(this, mensagem1, Toast.LENGTH_LONG).show()
        startActivity(cancelarTalhao)
    }
}
