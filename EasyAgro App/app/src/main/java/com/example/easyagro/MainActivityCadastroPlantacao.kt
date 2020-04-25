package com.example.easyagro


import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_cadastro_plantacao.*

class MainActivityCadastroPlantacao : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_plantacao)


        if (supportActionBar != null) {

            supportActionBar!!.hide()
        }

        link_listaPlantacao.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val idIrListaPlantacao = view.id
        if (idIrListaPlantacao == R.id.link_listaPlantacao) {
            handleSaveIrListaPlantacao()
        }
    }

    private fun handleSaveIrListaPlantacao() {
        startActivity(Intent(this, MainActivityListaPlantacao::class.java))
    }
}
