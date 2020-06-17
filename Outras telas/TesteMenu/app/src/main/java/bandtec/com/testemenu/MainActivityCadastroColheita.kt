package bandtec.com.testemenu

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_cadastro_colheita.*

class MainActivityCadastroColheita : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_colheita)

        if (supportActionBar != null) {

            supportActionBar!!.hide()
        }

        link_listaColheita.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val idIrListaColheita = view.id
        if (idIrListaColheita == R.id.link_listaColheita) {
            handleSaveIrListaColheita()
        }
    }
    private fun handleSaveIrListaColheita(){
        startActivity(Intent(this, MainActivityListaColheita::class.java))
    }
}
