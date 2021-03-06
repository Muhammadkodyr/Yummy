package kg.muha.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class PizzaPepperoniActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza_pepperoni)

        val discover = findViewById<ImageView>(R.id.discover_bottom)

        discover.setOnClickListener{
            startActivity(Intent(this,DiscoverActivity::class.java))
        }

        val myrecipes = findViewById<ImageView>(R.id.myrecipes_bottom)

        myrecipes.setOnClickListener{
            startActivity(Intent(this,MyRecipesActivity::class.java))
        }

        val back2 = findViewById<ImageView>(R.id.back2)

        back2.setOnClickListener{
            startActivity(Intent(this,LikedActivity::class.java))
        }
    }
}