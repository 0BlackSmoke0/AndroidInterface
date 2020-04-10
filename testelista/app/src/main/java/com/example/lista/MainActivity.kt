package com.example.lista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listview = findViewById<ListView>(R.id.listView)

        val list = mutableListOf<Model>()

       list.add(Model("Batata", "batata daora", R.drawable.batata))
        list.add(Model("Cenoura", "cenoura daora", R.drawable.cenoura))
        list.add(Model("Abobrinha", "abobrinha daora", R.drawable.abobrinha))
        list.add(Model("Tomate", "tomate daora", R.drawable.tomate))



        listview.adapter = MyAdapter(this, R.layout.row, list)

        listview.setOnItemClickListener{parent: AdapterView<*>, view:View, position:Int, id:Long ->
            if (position == 0 ) {
              Toast.makeText(this@MainActivity, "Você clicou na batata", Toast.LENGTH_LONG).show()
                    }
            if (position == 1 ) {
                Toast.makeText(this@MainActivity, "Você clicou na cenoura", Toast.LENGTH_LONG).show()
            }
            if (position == 2 ) {
                Toast.makeText(this@MainActivity, "Você clicou na abobrinha", Toast.LENGTH_LONG).show()
            }
            if (position == 3 ) {
                Toast.makeText(this@MainActivity, "Você clicou na tomate", Toast.LENGTH_LONG).show()
            }
                }
            }
}

