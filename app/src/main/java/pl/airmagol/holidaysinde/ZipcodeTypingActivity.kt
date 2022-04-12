package pl.airmagol.holidaysinde

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ZipcodeTypingActivity : AppCompatActivity() {

    private val logicPlz = CheckPrefix()
    private lateinit var etZipCode : EditText
    private lateinit var tvResult :TextView
    private lateinit var plz : String
    private lateinit var btnFind : Button
    private lateinit var answer : String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zipcode_typing)

        etZipCode = findViewById(R.id.etZipcode)
        btnFind = findViewById(R.id.find)
        tvResult = findViewById(R.id.tvResults)



        btnFind.setOnClickListener {
            plz = etZipCode.text.toString()
            if(plz.isNotEmpty()){
                answer = logicPlz.findLand(plz)
                tvResult.text = answer
            }
        }
    }
}