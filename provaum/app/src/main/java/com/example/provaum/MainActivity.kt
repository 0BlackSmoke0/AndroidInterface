package com.example.provaum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun ssj1(view: View){

        val a = kiPersona.text.toString()

        val aNumerico = a.toDouble()

        val person = nomePersona.text

        Toast.makeText(this,"O personagem ${person} tem o Ki como SSJ1  de ${retornaSsj(aNumerico)}", Toast.LENGTH_SHORT).show();


    }

    fun retornaSsj(aNumerico: Double): Double{

        return aNumerico * 50
    }

    fun ssj2(view: View){

        val a = kiPersona.text.toString()

        val aNumerico1 = a.toDouble()

        val person = nomePersona.text

        Toast.makeText(this,"O personagem ${person} tem o Ki como SSJ1  de ${retornaSsj2(aNumerico1)}", Toast.LENGTH_SHORT).show();


    }

    fun retornaSsj2(aNumerico: Double): Double{

        return aNumerico * 100
    }

    }