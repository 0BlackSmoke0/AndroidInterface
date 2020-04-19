package com.example.easyagro

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main_cadastro_senha.*

class MainActivityCadastroSenha : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_cadastro_senha)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        bt_validarSenha.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val validar = view.id
        if (validar == R.id.bt_validarSenha) {
            handleSaveValidar()
        }
    }

    private fun handleSaveValidar() {

        startActivity(Intent(this, MainActivityFinalzarCad::class.java))
    }


}
