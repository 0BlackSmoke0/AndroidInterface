package com.example.easyagro.Cultura


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.easyagro.MenuPrincipal.MainActivity
import com.example.easyagro.R

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
        val irGraphCultura = Intent(this, MainActivityGraficoCultura::class.java)
        startActivity(irGraphCultura)
    }

    fun btCadastrarCultura(view: View){
        val cadastrarCultura = Intent(this, MainActivityListaCultura::class.java)
        val mensagem1 = "Cultura Cadastrada!"
        Toast.makeText(this, mensagem1, Toast.LENGTH_LONG).show()
        startActivity(cadastrarCultura)
    }

    fun btCancelarCultura(view: View){
        val cancelarCultura = Intent(this, MainActivity::class.java)
        val mensagem1 = "Cultura Cancelada!"
        Toast.makeText(this, mensagem1, Toast.LENGTH_LONG).show()
        startActivity(cancelarCultura)
    }
}