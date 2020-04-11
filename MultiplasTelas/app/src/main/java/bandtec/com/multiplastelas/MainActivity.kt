package bandtec.com.multiplastelas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun irTela2 (v: View){
        val tela2 = Intent(this, Tela2::class.java)

        tela2.putExtra("Usuário", "zeruela")
        tela2.putExtra("Idade", 30)
        tela2.putExtra("isadmin", true)

        startActivity(tela2)
    }

    fun sair (v: View){
        finishAffinity()
    }
}
