package com.example.easyagro.Plantacao


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.easyagro.MenuPrincipal.MainActivity
import com.example.easyagro.R

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
        val irGraphPlant = Intent(this, MainActivityGraficoPlantacao::class.java)
        startActivity(irGraphPlant)

    }

    fun btCadastrarPlantacao(view: View){
        val cadastrarPlantacao = Intent(this, MainActivityListaPlantacao::class.java)
        val mensagem1 = "Plantação Cadastrada!"
        Toast.makeText(this, mensagem1, Toast.LENGTH_LONG).show()
        startActivity(cadastrarPlantacao)
    }

    fun btCancelarPlantacao(view: View){
        val cancelarPlantacao = Intent(this, MainActivity::class.java)
        val mensagem1 = "Plantação Cancelada!"
        Toast.makeText(this, mensagem1, Toast.LENGTH_LONG).show()
        startActivity(cancelarPlantacao)
    }

    fun linkAplicacao (view: View){
        val irAplicacao = Intent(this, MainActivityAplicacaoPlantacao::class.java)
        startActivity(irAplicacao)
    }
}
