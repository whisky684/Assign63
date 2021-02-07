package com.example.assign63

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.math.BigDecimal
import java.math.RoundingMode
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        bcal.setOnClickListener() {
            var sala = salary.text.toString().toDouble()
            var int = 0.00
            var int1 = 0.00
            for (i in 1..3) {
                int = (sala * 3) / 100
                int1 = int1 + int
                sala = sala + int
            }
            for (i in 1..4) {
                int = (sala * 5) / 100
                int1 = int1 + int
                sala = sala + int
            }
            for (i in 1..3) {
                int = (sala * 7) / 100
                int1 = int1 + int
                sala = sala + int
            }
            val decimal = BigDecimal(sala).setScale(2, RoundingMode.HALF_EVEN)
            val decimal1 = BigDecimal(int1).setScale(2, RoundingMode.HALF_EVEN)
            totalint.text = decimal1.toString()
            net.text = decimal.toString()

        }
        bclear.setOnClickListener(){
            salary.setText("")
            totalint.setText("")
            net.setText("")
        }
    }
}

