package com.example.lista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import bandtec.com.lista.Model
import bandtec.com.lista.MyAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView = findViewById<ListView>(R.id.listView)
        var list = mutableListOf<Model>()

        list.add(Model("Insumo 1", "Descrição do insumo 1..", R.drawable.insumoa))
        list.add(Model("Insumo 2", "Descrição do insumo 2..", R.drawable.insumob))
        list.add(Model("Insumo 3", "Descrição do insumo 3..", R.drawable.insumoc))
        list.add(Model("Insumo 4", "Descrição do insumo 4..", R.drawable.insumoc))
        list.add(Model("Insumo 5", "Descrição do insumo 5..", R.drawable.insumod))

        listView.adapter = MyAdapter(this, R.layout.linha, list)

        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position:Int, id:Long ->
            if (position == 0){
                Toast.makeText(this@MainActivity, "Clicar em insumo 1!", Toast.LENGTH_LONG).show()
            }
            if (position == 1){
                Toast.makeText(this@MainActivity, "Clicar em insumo 2!", Toast.LENGTH_LONG).show()
            }
            if (position == 2){
                Toast.makeText(this@MainActivity, "Clicar em insumo 3!", Toast.LENGTH_LONG).show()
            }
            if (position == 3){
                Toast.makeText(this@MainActivity, "Clicar em insumo 4!", Toast.LENGTH_LONG).show()
            }
            if (position == 4){
                Toast.makeText(this@MainActivity, "Clicar em insumo 5!", Toast.LENGTH_LONG).show()
            }
        }
    }
    }

