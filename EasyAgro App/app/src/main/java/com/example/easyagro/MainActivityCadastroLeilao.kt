package com.example.easyagro

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_cadastro_leilao.*

class MainActivityCadastroLeilao : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_leilao)

        if (supportActionBar != null) {

            supportActionBar!!.hide()
        }

        link_listaLeilao.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val idIrListaLeilao = view.id
        if (idIrListaLeilao == R.id.link_listaLeilao) {
            handleSaveIrListaLeilao()
        }
    }

    private fun handleSaveIrListaLeilao() {
        startActivity(Intent(this, MainActivityListaLeilao::class.java))
    }
}
