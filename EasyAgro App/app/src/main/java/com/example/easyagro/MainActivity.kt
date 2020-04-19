package com.example.easyagro

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_menu_principal.*


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_principal)

        if (supportActionBar != null) {

            supportActionBar!!.hide()
        }

        bt_colheita.setOnClickListener(this)
        bt_cultura.setOnClickListener(this)
        bt_leilao.setOnClickListener(this)
        bt_plantacao.setOnClickListener(this)
        bt_talhão.setOnClickListener(this)
        bt_insumo.setOnClickListener(this)
    }

    override fun onClick(view: View) {

        val id = view.id
        if (id == R.id.bt_colheita) {
            handleSave()
        }

        if (id == R.id.bt_cultura) {
            handleSave1()
        }

        if (id == R.id.bt_leilao) {
            handleSave3()
        }

        if (id == R.id.bt_plantacao) {
            handleSave4()
        }

        if (id == R.id.bt_talhão) {
            handleSave2()
        }

        if (id == R.id.bt_insumo) {
            handleSave5()
        }
    }


    private fun handleSave() {

        startActivity(Intent(this, MainActivityCadastroColheita::class.java))
    }

    private fun handleSave1() {

        startActivity(Intent(this, MainActivityCadastroCultura::class.java))
    }

    private fun handleSave3() {

        startActivity(Intent(this, MainActivityCadastroLeilao::class.java))
    }

    private fun handleSave4() {

        startActivity(Intent(this, MainActivityCadastroPlantacao::class.java))
    }

    private fun handleSave2() {

        startActivity(Intent(this, MainActivityCadastroTalhao::class.java))
    }

    private fun handleSave5() {

        startActivity(Intent(this, MainActivityCadastroInsumo::class.java))
    }

}

