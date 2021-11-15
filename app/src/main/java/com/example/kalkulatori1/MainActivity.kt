package com.example.kalkulatori1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var resultTextView: TextView
    private var operand: Double = 0.0
    private var operation: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        resultTextView = findViewById(R.id.resultTextView)
    }

    fun numberClick(clickedView: TextView) {

        if (clickedView is TextView)  {

            var result: String = resultTextView.text.toString()
            val number: String = clickedView.text.toString()

            if (result == "0" ){
                result == ""
            }

            resultTextView.text = result + number
        }

    }

    fun operationClick(clickedView: View){

        if (clickedView is TextView){

            val result: String = resultTextView.text.toString()

            if (result.isNotEmpty()){

                this.operand = result.toDouble()
            }

            resultTextView.text = ""

            this.operation = clickedView.text.toString()

        }

    }

    fun equalsClick(clickedView: View) {

        val result: String = resultTextView.text.toString()
        var secOperand: Double = 0.0

        if (result.isNotEmpty()){
            secOperand = result.toDouble()

        }

        when (operation) {
            "+" -> resultTextView.text = (operand + secOperand).toString()
            "-" -> resultTextView.text = (operand - secOperand).toString()
            "/" -> resultTextView.text = (operand / secOperand).toString()
            "*" -> resultTextView.text = (operand * secOperand).toString()

        }

    }

}
