package bandtec.com.listadeinsumo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun irTela2 (v:View){
        val tela2 = Internet(this, Tela2::class.java)
        startActivity(Tela2)
    }

}
