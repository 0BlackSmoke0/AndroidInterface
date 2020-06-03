package com.example.easyagro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.example.easyagro.Adapter.MyAdapterLeilao
import com.example.easyagro.R

class MainActivityListaLeilao : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_lista_leilao)


        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        var listView = findViewById<ListView>(R.id.listViewLeilao)
        var list = mutableListOf<Model>()

        list.add(Model("Leilão 1", "Descrição do Leilão 1..", R.drawable.leilaocolorlista))
        list.add(Model("Leilão 2", "Descrição do Leilão 2..", R.drawable.leilaocolorlista))
        list.add(Model("Leilão 3", "Descrição do Leilão 3..", R.drawable.leilaocolorlista))
        list.add(Model("Leilão 4", "Descrição do Leilão 4..", R.drawable.leilaocolorlista))
        list.add(Model("Leilão 5", "Descrição do Leilão 5..", R.drawable.leilaocolorlista))

        listView.adapter = MyAdapterLeilao(this, R.layout.linha_leilao, list)

        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->

            if (position == 0) {
                Toast.makeText(this@MainActivityListaLeilao, "Clicar em leilão 1!", Toast.LENGTH_LONG).show()
            }
            if (position == 1) {
                Toast.makeText(this@MainActivityListaLeilao, "Clicar em leilão 2!", Toast.LENGTH_LONG).show()
            }
            if (position == 2) {
                Toast.makeText(this@MainActivityListaLeilao, "Clicar em leilão 3!", Toast.LENGTH_LONG).show()
            }
            if (position == 3) {
                Toast.makeText(this@MainActivityListaLeilao, "Clicar em leilão 4!", Toast.LENGTH_LONG).show()
            }
            if (position == 4) {
                Toast.makeText(this@MainActivityListaLeilao, "Clicar em leilão 5!", Toast.LENGTH_LONG).show()
            }
        }
    }

    fun listaCadastroLeilao(view: View){
        val leilaoCadastro = Intent(this, MainActivityCadastroLeilao::class.java)
        startActivity(leilaoCadastro)
    }

    fun leilaoGrafico(view: View){
        val mensagem1 = "Tela em construção..."
        Toast.makeText(this, mensagem1, Toast.LENGTH_LONG).show()
    }
}