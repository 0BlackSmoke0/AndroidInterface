package bandtec.com.lista

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

        var listView = findViewById<ListView>(R.id.listView)
        var list = mutableListOf<Model>()

        list.add(Model("Facebook", "Facebook description..", R.drawable.insumoa))
        list.add(Model("Whatsapp", "Whatsapp description..", R.drawable.insumob))
        list.add(Model("Twitter", "Twitter description..", R.drawable.insumoc))
        list.add(Model("Instagram", "Instagram description..", R.drawable.insumoc))
        list.add(Model("Youtube", "Youtube description..", R.drawable.insumod))

        listView.adapter = MyAdapter(this, R.layout.linha, list)

        listView.setOnItemClickListener { parent:AdapterView<*>, view:View, position:Int, id:Long ->
            if (position == 0){
                Toast.makeText(this@MainActivity, "You click on facebook!", Toast.LENGTH_LONG).show()
            }
            if (position == 1){
                Toast.makeText(this@MainActivity, "You click on Whatsapp!", Toast.LENGTH_LONG).show()
            }
            if (position == 2){
                Toast.makeText(this@MainActivity, "You click on Twitter!", Toast.LENGTH_LONG).show()
            }
            if (position == 3){
                Toast.makeText(this@MainActivity, "You click on Instagram!", Toast.LENGTH_LONG).show()
            }
            if (position == 4){
                Toast.makeText(this@MainActivity, "You click on Youtube!", Toast.LENGTH_LONG).show()
            }
        }
    }
}
