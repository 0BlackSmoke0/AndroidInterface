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

        list.add(Model("01- Plantação de tomate", "", R.drawable.tomate))
        list.add(Model("02- Plantação de cenoura", "", R.drawable.cenoura))
        list.add(Model("03- Plantação de batata", "", R.drawable.batata))


        listView.adapter = MyAdapter(this, R.layout.activity_main, list)

        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position:Int, id:Long ->
            if (position == 0){
                Toast.makeText(this@MainActivity, "Clicar em plantação 01!", Toast.LENGTH_LONG).show()
            }
            if (position == 1){
                Toast.makeText(this@MainActivity, "Clicar em plantação 02!", Toast.LENGTH_LONG).show()
            }
            if (position == 2){
                Toast.makeText(this@MainActivity, "Clicar em plantação 03!", Toast.LENGTH_LONG).show()
            }

        }
    }
    }

