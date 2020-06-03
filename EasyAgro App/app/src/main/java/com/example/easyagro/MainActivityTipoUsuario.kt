package com.example.easyagro


import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main_tipo_usuario.*

class MainActivityTipoUsuario : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_tipo_usuario)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        bt_ger_lei.setOnClickListener(this)
        bt_gerenciar.setOnClickListener(this)
        bt_leiloar.setOnClickListener(this)
        bt_negociar.setOnClickListener(this)
    }

    override fun onClick(view: View) {

        val idUser = view.id
        if (idUser == R.id.bt_ger_lei) {
            handleSaveUser1()
        }

        val idUser2 = view.id
        if (idUser2 == R.id.bt_gerenciar) {
            handleSaveUser2()
        }

        val idUser3 = view.id
        if (idUser3 == R.id.bt_leiloar) {
            handleSaveUser3()
        }

        val idUser4 = view.id
        if (idUser4 == R.id.bt_negociar) {
            handleSaveUser4()
        }
    }

    private fun handleSaveUser1() {

        startActivity(Intent(this, MainActivityCadastroUsuario::class.java))
    }

    private fun handleSaveUser2() {

        startActivity(Intent(this, MainActivityCadastroUsuario::class.java))
    }

    private fun handleSaveUser3() {

        startActivity(Intent(this, MainActivityUsuarioDif::class.java))
    }

    private fun handleSaveUser4() {

        startActivity(Intent(this, MainActivityUsuarioDif::class.java))
    }
}
