package trinidad.daniel.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnCold: Button = findViewById(R.id.button_cold_drinks) as Button
        var btnHot: Button = findViewById(R.id.button_hot_drinks) as Button
        var btnSweets: Button = findViewById(R.id.button_sweets) as Button
        var btnSalties: Button = findViewById(R.id.button_salties) as Button

        btnCold.setOnClickListener{
            var intent: Intent = Intent(this, ProductsActivity::class.java)
            intent.putExtra("button", "coldDrinks")
            startActivity(intent)
        }

        btnHot.setOnClickListener{
            var intent: Intent = Intent(this, ProductsActivity::class.java)
            intent.putExtra("button", "hotDrinks")
            startActivity(intent)
        }

        btnSweets.setOnClickListener{
            var intent: Intent = Intent(this, ProductsActivity::class.java)
            intent.putExtra("button", "sweets")
            startActivity(intent)
        }

        btnSalties.setOnClickListener{
            var intent: Intent = Intent(this, ProductsActivity::class.java)
            intent.putExtra("button", "salties")
            startActivity(intent)
        }
    }
}