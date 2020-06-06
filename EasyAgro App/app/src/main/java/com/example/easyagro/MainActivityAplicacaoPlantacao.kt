package com.example.easyagro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivityAplicacaoPlantacao : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_aplicacao_plantacao)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
    }

    fun salvarAplicacaoPlant(view: View){
        val salvarApp = Intent(this, MainActivityCadastroPlantacao::class.java)
        startActivity(salvarApp)
    }

    fun cancelarAplicacaoPlant(view: View) {
        val cancelarApp = Intent(this, MainActivityCadastroPlantacao::class.java)
        startActivity(cancelarApp)
    }
}
