package com.example.easyagro.Login

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.easyagro.MenuPrincipal.MainActivity
import com.example.easyagro.CadastroUsuario.MainActivityTipoUsuario
import com.example.easyagro.R
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
    }

    fun entrarMenu(view: View){

        val telaMenuPrincipal = Intent(this, MainActivity::class.java)
        val login = username.text.toString()
        val senha = password.text.toString()

        if (login == "bertucci.henrique@gmail.com"  && senha == "@48285904806Pp") {
            val mensagem1 = "Login realizado com sucesso!"
            Toast.makeText(this, mensagem1, Toast.LENGTH_LONG).show()
            startActivity(telaMenuPrincipal)


        } else {
            val mensagem = "Login ou senha estão incorretos, tente novamente..."
            Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show()
        }

        telaMenuPrincipal.putExtra("login", login)
        telaMenuPrincipal.putExtra("login", senha)
    }

    fun cadastroUsuario(view: View){
        val telaCadastroUsuarios = Intent(this, MainActivityTipoUsuario::class.java)
        startActivity(telaCadastroUsuarios)
    }
}

