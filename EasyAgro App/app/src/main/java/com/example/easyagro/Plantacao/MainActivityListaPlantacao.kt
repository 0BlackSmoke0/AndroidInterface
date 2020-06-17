package com.example.easyagro.Plantacao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.example.easyagro.Adapter.MyAdapterPlantacao
import com.example.easyagro.Models.Model
import com.example.easyagro.R


class MainActivityListaPlantacao : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_lista_plantacao)

        if (supportActionBar != null) {

            supportActionBar!!.hide()
        }

        var listView = findViewById<ListView>(R.id.listViewPlantacao)
        var list = mutableListOf<Model>()

        list.add(
            Model(
                "Plantação 1",
                "Sobre a plantação...",
                R.drawable.plantacaocolorlista
            )
        )
        list.add(
            Model(
                "Plantação 2",
                "Sobre a plantação",
                R.drawable.plantacaocolorlista
            )
        )
        list.add(
            Model(
                "Plantação 3",
                "Sobre a plantação",
                R.drawable.plantacaocolorlista
            )
        )


        listView.adapter = MyAdapterPlantacao(this,
            R.layout.linha_plantacao, list)

        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position:Int, id:Long ->
            if (position == 0){
                Toast.makeText(this@MainActivityListaPlantacao, "Clicar em plantação 01!", Toast.LENGTH_LONG).show()
            }
            if (position == 1){
                Toast.makeText(this@MainActivityListaPlantacao, "Clicar em plantação 02!", Toast.LENGTH_LONG).show()
            }
            if (position == 2){
                Toast.makeText(this@MainActivityListaPlantacao, "Clicar em plantação 03!", Toast.LENGTH_LONG).show()
            }

        }
    }

    fun plantaçãoCadastro (view: View){
        val listaCadastroPlantacao = Intent(this, MainActivityCadastroPlantacao::class.java)
        startActivity(listaCadastroPlantacao)
    }

    fun plantacaoGrafico (view: View){
        val graphPlantacao = Intent(this, MainActivityGraficoPlantacao::class.java)
        startActivity(graphPlantacao)
    }

}

