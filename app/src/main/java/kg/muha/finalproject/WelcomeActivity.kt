package kg.muha.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.muha.finalproject.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.letsgo.setOnClickListener {
            startActivity(Intent(this,SigninActivity::class.java))
        }

    }
}