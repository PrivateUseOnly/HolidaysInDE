package pl.airmagol.holidaysinde

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class ZipcodeTypingActivity : AppCompatActivity() {

    private val logicPlz = LogicPLZ()
    private lateinit var etZipCode : EditText
    private lateinit var tvResult :TextView
    private lateinit var plz : String
    private lateinit var btnFind : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zipcode_typing)

        etZipCode = findViewById(R.id.etZipcode)
        btnFind = findViewById(R.id.find)



        btnFind.setOnClickListener {
            plz = etZipCode.text.toString()
            var plzInt = plz.toInt()
            plz = plzInt.toString()
            val answer = logicPlz.findLand(plz)
            Toast.makeText(this, answer, Toast.LENGTH_SHORT).show()
        }
    }
}