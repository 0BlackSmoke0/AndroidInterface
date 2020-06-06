package com.example.easyagro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.example.easyagro.Adapter.MyAdapterTalhao
import com.example.easyagro.R

class MainActivityListaTalhao : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_lista_talhao)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        var listView = findViewById<ListView>(R.id.listViewTalhao)
        var list = mutableListOf<Model>()

        list.add(Model("Talhão 1", "Descrição do Talhão 1..", R.drawable.talhaocolorlista))
        list.add(Model("Talhão 2", "Descrição do Talhão 2..", R.drawable.talhaocolorlista))
        list.add(Model("Talhão 3", "Descrição do Talhão 3..", R.drawable.talhaocolorlista))
        list.add(Model("Talhão 4", "Descrição do Talhão 4..", R.drawable.talhaocolorlista))
        list.add(Model("Talhão 5", "Descrição do Talhão 5..", R.drawable.talhaocolorlista))

        listView.adapter = MyAdapterTalhao(this, R.layout.linha_talhao, list)

        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->

            if (position == 0) {
                Toast.makeText(this@MainActivityListaTalhao, "Clicar em talhão 1!", Toast.LENGTH_LONG).show()
            }
            if (position == 1) {
                Toast.makeText(this@MainActivityListaTalhao, "Clicar em talhão 2!", Toast.LENGTH_LONG).show()
            }
            if (position == 2) {
                Toast.makeText(this@MainActivityListaTalhao, "Clicar em talhão 3!", Toast.LENGTH_LONG).show()
            }
            if (position == 3) {
                Toast.makeText(this@MainActivityListaTalhao, "Clicar em talhão 4!", Toast.LENGTH_LONG).show()
            }
            if (position == 4) {
                Toast.makeText(this@MainActivityListaTalhao, "Clicar em insumo 5!", Toast.LENGTH_LONG).show()
            }
        }
    }

    fun listaTalhaoCadastro(view: View){
        val talhaoCadastro = Intent(this, MainActivityCadastroTalhao::class.java)
        startActivity(talhaoCadastro)
    }

    fun graficoTalhao(view: View){
        val graphTalhao = Intent(this, MainActivityGraficoTalhao::class.java)
        startActivity(graphTalhao)
    }
}
