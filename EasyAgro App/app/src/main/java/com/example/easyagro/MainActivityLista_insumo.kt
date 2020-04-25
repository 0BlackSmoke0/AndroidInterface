package com.example.easyagro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivityLista_insumo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_lista_insumo)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        var listView = findViewById<ListView>(R.id.listView)
        var list = mutableListOf<Model>()

        list.add(Model("Insumo 1", "Descrição do insumo 1..", R.drawable.insumoscolorlista))
        list.add(Model("Insumo 2", "Descrição do insumo 2..", R.drawable.insumoscolorlista))
        list.add(Model("Insumo 3", "Descrição do insumo 3..", R.drawable.insumoscolorlista))
        list.add(Model("Insumo 4", "Descrição do insumo 4..", R.drawable.insumoscolorlista))
        list.add(Model("Insumo 5", "Descrição do insumo 5..", R.drawable.insumoscolorlista))

        listView.adapter = MyAdapterInsumo(this, R.layout.linha_insumo, list)

        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->

            if (position == 0) {
                Toast.makeText(this@MainActivityLista_insumo, "Clicar em insumo 1!", Toast.LENGTH_LONG).show()
            }
            if (position == 1) {
                Toast.makeText(this@MainActivityLista_insumo, "Clicar em insumo 2!", Toast.LENGTH_LONG).show()
            }
            if (position == 2) {
                Toast.makeText(this@MainActivityLista_insumo, "Clicar em insumo 3!", Toast.LENGTH_LONG).show()
            }
            if (position == 3) {
                Toast.makeText(this@MainActivityLista_insumo, "Clicar em insumo 4!", Toast.LENGTH_LONG).show()
            }
            if (position == 4) {
                Toast.makeText(this@MainActivityLista_insumo, "Clicar em insumo 5!", Toast.LENGTH_LONG).show()
            }
        }
    }

}

