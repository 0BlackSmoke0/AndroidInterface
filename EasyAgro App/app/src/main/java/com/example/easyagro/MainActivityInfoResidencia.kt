package com.example.easyagro


import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main_info_residencia.*

class MainActivityInfoResidencia : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_info_residencia)

        if(supportActionBar != null){

            supportActionBar!!.hide()
        }

        bt_prox.setOnClickListener(this)
        bt_ant.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val idResP = view.id
        if (idResP == R.id.bt_prox){
            handleSaveResP()
        }

        if (idResP == R.id.bt_ant){
            handleSaveResV()
        }
    }

    private fun handleSaveResP(){

        //(invertida (voltar)
        startActivity(Intent(this, MainActivityCadastroUsuario::class.java))
    }

    private fun handleSaveResV(){

        //(invertida (voltar)
        startActivity(Intent(this, MainActivityCadastroSenha::class.java))
    }
}
