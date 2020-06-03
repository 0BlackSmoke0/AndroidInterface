package com.example.easyagro


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_cadastro_insumo.*

class MainActivityCadastroInsumo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_insumo)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

    }

    fun irListaInsumo(view: View) {
        val idIrLista = Intent(this, MainActivityLista_insumo::class.java)
        startActivity(idIrLista)
    }

    fun irGraficoInsumos(view: View){
        val mensagem1 = "Tela em construção..."
        Toast.makeText(this, mensagem1, Toast.LENGTH_LONG).show()
    }

    fun btCadastrarInsumo(view: View){
        val mensagem1 = "Insumo Cadastrado!"
        Toast.makeText(this, mensagem1, Toast.LENGTH_LONG).show()
    }

    fun btCancelarInsumo(view: View){
        val mensagem1 = "Insumo Cancelado!."
        Toast.makeText(this, mensagem1, Toast.LENGTH_LONG).show()
    }

}
