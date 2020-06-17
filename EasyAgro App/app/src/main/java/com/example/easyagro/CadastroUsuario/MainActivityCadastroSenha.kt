package com.example.easyagro.CadastroUsuario

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.easyagro.R

class MainActivityCadastroSenha : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_cadastro_senha)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

    }

    fun finalizarCadastroUser(view: View) {
        val idValidar = Intent(this, MainActivityFinalzarCad::class.java)
        val mensagem1 = "Cadastro finalizado com sucesso!"
        Toast.makeText(this, mensagem1, Toast.LENGTH_LONG).show()
        startActivity(idValidar)
    }

}
