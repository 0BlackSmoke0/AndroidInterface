package com.example.easyagro

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        if(supportActionBar != null){
            supportActionBar!!.hide()
        }

        btn_login.setOnClickListener(this)

    }
    override fun onClick(view: View) {

        val id = view.id
        if (id == R.id.btn_login) {
            handleSave2()
        }
    }
        private fun handleSave2(){
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
