package com.example.easyagro.CadastroUsuario

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.easyagro.R
import kotlinx.android.synthetic.main.activity_main_usuario_dif.*

class MainActivityUsuarioDif : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_usuario_dif)


        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        bt_avancaDif.setOnClickListener(this)
        bt_voltarDif.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        val userDif = view.id
        if (userDif == R.id.bt_avancaDif) {
            handleSaveDif()
        }

        if (userDif == R.id.bt_voltarDif) {
            handleSaveDifUser()
        }
    }

    private fun handleSaveDif() { //valor invertido ( duvidas chamar o paulo)

        startActivity(Intent(this, MainActivityTipoUsuario::class.java))
    }

    private fun handleSaveDifUser() { // valor invertido ( duvidas chamar o paulo)

        startActivity(Intent(this, MainActivityCadastroSenha::class.java))
    }
}
