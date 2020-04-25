package com.example.easyagro

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_cadastro_talhao.*

class MainActivityCadastroTalhao : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_talhao)

        if (supportActionBar != null) {

            supportActionBar!!.hide()
        }

        link_listaTalhao.setOnClickListener(this)
    }

    override fun onClick(view: View) {

        val idIrListaTalhao = view.id
        if (idIrListaTalhao == R.id.link_listaTalhao) {
            handleSaveIrListaTalhao()
        }
    }
    private fun handleSaveIrListaTalhao(){
        startActivity(Intent(this, MainActivityListaTalhao::class.java))
    }
}
