package com.example.easyagro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main_finalzar_cad.*

class MainActivityFinalzarCad : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_finalzar_cad)

        if(supportActionBar != null){
            supportActionBar!!.hide()
        }

        bt_cadastroValidado.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val idValidado = view.id
        if (idValidado == R.id.bt_cadastroValidado) {
            handleSaveValidado()

        }
    }

    private fun handleSaveValidado(){
        startActivity(Intent(this,Main2Activity::class.java))
    }
}
