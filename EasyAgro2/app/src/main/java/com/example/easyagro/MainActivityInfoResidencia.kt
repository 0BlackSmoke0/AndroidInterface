package com.example.easyagro


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivityInfoResidencia : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_info_residencia)

        if(supportActionBar != null){

            supportActionBar!!.hide()
        }
    }
}
