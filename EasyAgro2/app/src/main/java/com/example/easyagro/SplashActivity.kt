package com.example.easyagro

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main_tela1.*


class SplashActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_tela1)

        if(supportActionBar != null){

            supportActionBar!!.hide()
        }

        btnCad.setOnClickListener(this)
        btLogin.setOnClickListener(this)


    }

    override fun onClick(view: View) {
        val id = view.id
        if (id == R.id.btnCad) {
            handleSave()
        }else{
            (id == R.id.btLogin)
            handleSave1()
        }
    }

    private fun handleSave(){

        startActivity(Intent(this, MainActivityTipoUsuario::class.java))
    }

    private fun handleSave1(){

        startActivity(Intent(this, Main2Activity::class.java))
    }

}



