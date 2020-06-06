package com.example.easyagro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.example.easyagro.Adapter.MyAdapterCultura
import com.example.easyagro.R

class MainActivityListaCultura : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_lista_cultura)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        var listView = findViewById<ListView>(R.id.listViewCultura)
        var list = mutableListOf<Model>()

        list.add(Model("Cultura 1", "Descrição da cultura 1..", R.drawable.sementescolorlista))
        list.add(Model("Cultura 2", "Descrição da cultura 2..", R.drawable.sementescolorlista))
        list.add(Model("Cultura 3", "Descrição da cultura 3..", R.drawable.sementescolorlista))
        list.add(Model("Cultura 4", "Descrição da cultura 4..", R.drawable.sementescolorlista))
        list.add(Model("Cultura 5", "Descrição da cultura 5..", R.drawable.sementescolorlista))

        listView.adapter = MyAdapterCultura(this, R.layout.linha_cultura, list)

        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->

            if (position == 0) {
                Toast.makeText(this@MainActivityListaCultura, "Clicar em cultura 1!", Toast.LENGTH_LONG).show()
            }
            if (position == 1) {
                Toast.makeText(this@MainActivityListaCultura, "Clicar em cultura 2!", Toast.LENGTH_LONG).show()
            }
            if (position == 2) {
                Toast.makeText(this@MainActivityListaCultura, "Clicar em cultura 3!", Toast.LENGTH_LONG).show()
            }
            if (position == 3) {
                Toast.makeText(this@MainActivityListaCultura, "Clicar em cultura 4!", Toast.LENGTH_LONG).show()
            }
            if (position == 4) {
                Toast.makeText(this@MainActivityListaCultura, "Clicar em cultura 5!", Toast.LENGTH_LONG).show()
            }
        }

    }

    fun culturaCadastro(view: View) {
        val listaCadastroCultura = Intent(this, MainActivityCadastroCultura::class.java)
        startActivity(listaCadastroCultura)
    }

    fun listaGrafico(view: View) {
        val graphCultura = Intent(this, MainActivityGraficoCultura::class.java)
        startActivity(graphCultura)
    }

}
