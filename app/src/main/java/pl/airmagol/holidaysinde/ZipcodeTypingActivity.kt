package pl.airmagol.holidaysinde

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ZipcodeTypingActivity : AppCompatActivity() {

    private val checkPrefix = CheckPrefix()
    private val checkZipcode = CheckZipcode()
    private lateinit var etZipCode : EditText
    private lateinit var tvResult :TextView
    private lateinit var plz : String
    private lateinit var btnFind : Button
    private lateinit var answer : String
    private lateinit var btnLand1 : Button
    private lateinit var btnLand2 : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zipcode_typing)

        etZipCode = findViewById(R.id.etZipcode)
        btnFind = findViewById(R.id.find)
        tvResult = findViewById(R.id.tvResults)
        btnLand1 = findViewById(R.id.btn_land1)
        btnLand2 = findViewById(R.id.btn_land2)



        btnFind.setOnClickListener {
            validateZipcode()
  //          if(answer.isNotEmpty()){
  //              btnLand1.text = checkZipcode.land1
  //          }
        }

            //btnLand1.setOnClickListener { showHolidaysLand1()}

    }

    private fun showHolidaysLand1() {
        TODO("Not yet implemented")
    }

    private fun validateZipcode(){
        plz = etZipCode.text.toString()
        if(plz.isNotEmpty()){
            answer = checkPrefix.findLand(plz)
            tvResult.text = answer
            }
    }
}