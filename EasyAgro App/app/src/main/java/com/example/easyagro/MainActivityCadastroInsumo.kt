package com.example.easyagro


import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_cadastro_insumo.*

class MainActivityCadastroInsumo : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_insumo)

        if (supportActionBar != null) {

            supportActionBar!!.hide()
        }

        link_listaInsumo.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val idIrLista = view.id
        if (idIrLista == R.id.link_listaInsumo) {
            handleSaveIrLista()
        }
    }

    private fun handleSaveIrLista() {
        startActivity(Intent(this, MainActivityLista_insumo::class.java))
    }
}
