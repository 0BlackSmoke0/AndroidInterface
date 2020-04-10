package com.example.easyagro

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivityTipoUsuario : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_tipo_usuario)

        if(supportActionBar != null){

            supportActionBar!!.hide()
        }
    }
}
