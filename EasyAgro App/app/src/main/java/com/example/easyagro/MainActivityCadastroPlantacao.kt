package com.example.easyagro


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_cadastro_plantacao.*

class MainActivityCadastroPlantacao : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_plantacao)


        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

    }

    fun irListaPlantacao(view: View) {
        val idIrListaPlantacao = Intent(this, MainActivityListaPlantacao::class.java)
        startActivity(idIrListaPlantacao)
    }

    fun irGraficoPlantacao(view: View){
        val mensagem1 = "Tela em construção..."
        Toast.makeText(this, mensagem1, Toast.LENGTH_LONG).show()
    }

    fun btCadastrarPlantacao(view: View){
        val mensagem1 = "Plantação Cadastrada!"
        Toast.makeText(this, mensagem1, Toast.LENGTH_LONG).show()
    }

    fun btCancelarPlantacao(view: View){
        val mensagem1 = "Plantação Cancelada!"
        Toast.makeText(this, mensagem1, Toast.LENGTH_LONG).show()
    }


}
