package com.example.easyagro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivityListaColheita : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_lista_colheita)


        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        var listView = findViewById<ListView>(R.id.listViewColheita)
        var list = mutableListOf<Model>()

        list.add(Model("Colheita 1", "Descrição da Colheita 1..", R.drawable.colheitacolorlista))
        list.add(Model("Colheita 2", "Descrição da Colheita 2..", R.drawable.colheitacolorlista))
        list.add(Model("Colheita 3", "Descrição da Colheita 3..", R.drawable.colheitacolorlista))
        list.add(Model("Colheita 4", "Descrição da Colheita 4..", R.drawable.colheitacolorlista))
        list.add(Model("Colheita 5", "Descrição da Colheita 5..", R.drawable.colheitacolorlista))

        listView.adapter = MyAdapterColheita(this, R.layout.linha_colheita, list)

        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->

            if (position == 0) {
                Toast.makeText(this@MainActivityListaColheita, "Clicar em colheita 1!", Toast.LENGTH_LONG).show()
            }
            if (position == 1) {
                Toast.makeText(this@MainActivityListaColheita, "Clicar em colheita 2!", Toast.LENGTH_LONG).show()
            }
            if (position == 2) {
                Toast.makeText(this@MainActivityListaColheita, "Clicar em colheita 3!", Toast.LENGTH_LONG).show()
            }
            if (position == 3) {
                Toast.makeText(this@MainActivityListaColheita, "Clicar em colheita 4!", Toast.LENGTH_LONG).show()
            }
            if (position == 4) {
                Toast.makeText(this@MainActivityListaColheita, "Clicar em colheita 5!", Toast.LENGTH_LONG).show()
            }
        }
    }

}
