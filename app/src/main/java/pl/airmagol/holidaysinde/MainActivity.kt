package pl.airmagol.holidaysinde

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDate : Button = findViewById(R.id.btn_openApp)

        btnDate.setOnClickListener {
            val intent = Intent(this, ZipcodeTypingActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}