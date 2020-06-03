package com.example.easyagro


import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.easyagro.R
import kotlinx.android.synthetic.main.activity_main_info_residencia.*

class MainActivityInfoResidencia : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_info_residencia)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
}

    fun avancarTela1(view: View) {
        val idAvancarTela = Intent(this, MainActivityCadastroSenha::class.java)
        startActivity(idAvancarTela)
        }

    fun voltarTela1(view: View){
        val idVoltarTela = Intent(this, MainActivityCadastroUsuario::class.java)
        startActivity(idVoltarTela)
    }

}
