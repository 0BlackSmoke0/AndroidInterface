package com.example.easyagro.Colheita

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.easyagro.MenuPrincipal.MainActivity
import com.example.easyagro.R

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
        val irGraphColheita = Intent(this, MainActivityGraficoColheita::class.java)
        startActivity(irGraphColheita)
    }

    fun btCadastrarColheita(view: View){
        val cadastrarColheita = Intent(this, MainActivityListaColheita::class.java)
        val mensagem1 = "Colheita cadastrada!"
        Toast.makeText(this, mensagem1, Toast.LENGTH_LONG).show()
        startActivity(cadastrarColheita)
    }

    fun btCancelarCadastroDeColheita(view: View){
        val cancelarColheita = Intent(this, MainActivity::class.java)
        val mensagem1 = "Colheita Cancelada."
        Toast.makeText(this, mensagem1, Toast.LENGTH_LONG).show()
        startActivity(cancelarColheita)
    }


}
