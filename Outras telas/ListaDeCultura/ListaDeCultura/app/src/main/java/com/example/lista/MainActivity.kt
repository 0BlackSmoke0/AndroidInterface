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

        list.add(Model("Semente", "Semente de feijão", R.drawable.cultura1))
        list.add(Model("Raiz", "Raiz de batata", R.drawable.cultura2))
        list.add(Model("Muda", "Muda de lichia", R.drawable.cultura3))


        listView.adapter = MyAdapter(this, R.layout.linha, list)

        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position:Int, id:Long ->
            if (position == 0){
                Toast.makeText(this@MainActivity, "Clicar em cultura 1!", Toast.LENGTH_LONG).show()
            }
            if (position == 1){
                Toast.makeText(this@MainActivity, "Clicar em cultura 2!", Toast.LENGTH_LONG).show()
            }
            if (position == 2){
                Toast.makeText(this@MainActivity, "Clicar em cultura 3!", Toast.LENGTH_LONG).show()
            }
            if (position == 3){
                Toast.makeText(this@MainActivity, "Clicar em cultura 4!", Toast.LENGTH_LONG).show()
            }
            if (position == 4){
                Toast.makeText(this@MainActivity, "Clicar em cultura 5!", Toast.LENGTH_LONG).show()
            }
        }
    }
    }

