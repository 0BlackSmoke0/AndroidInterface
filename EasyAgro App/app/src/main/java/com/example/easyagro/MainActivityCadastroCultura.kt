package com.example.easyagro


import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_cadastro_cultura.*

class MainActivityCadastroCultura : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_cultura)

        if (supportActionBar != null) {

            supportActionBar!!.hide()

            link_listaCultura.setOnClickListener(this)
        }
    }

    override fun onClick(view: View) {

        val idIrListaCultura = view.id
        if (idIrListaCultura == R.id.link_listaCultura) {
            handleSaveIrListaCultura()
        }
    }

    private fun handleSaveIrListaCultura(){
        startActivity(Intent(this, MainActivityListaCultura::class.java))
    }
}