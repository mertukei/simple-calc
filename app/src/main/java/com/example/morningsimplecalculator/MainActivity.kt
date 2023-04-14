package com.example.morningsimplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var mAnswer:TextView
    lateinit var mFnum:EditText
    lateinit var mSnum:EditText
    lateinit var mAdd:Button
    lateinit var mSub:Button
    lateinit var mMultiplication:Button
    lateinit var mDiv:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mAnswer = findViewById(R.id.mtvAnswer)
        mFnum = findViewById(R.id.mEdtFnum)
        mSnum = findViewById(R.id.mEdtSnum)
        mAdd = findViewById(R.id.mbtnadd)
        mSub = findViewById(R.id.mbtnsub)
        mMultiplication = findViewById(R.id.mbtnmultiplication)
        mDiv = findViewById(R.id.mbtndiv)
        // set onClick listeners to all the buttons
        mAdd.setOnClickListener {
            // receive the first and second number to compute
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "please enter valid number"
            }else{
                // proceed to compute the values
                var jibu = firstNumber.toDouble() + secondNumber.toDouble()
                mAnswer.text = jibu.toString()
            }
        }
        mSub.setOnClickListener {
            // receive the first and second number to compute
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "please enter valid number"
            }else{
                // proceed to compute the values
                var jibu = firstNumber.toDouble() - secondNumber.toDouble()
                mAnswer.text = jibu.toString()
            }

        }
        mMultiplication.setOnClickListener {
            // receive the first and second number to compute
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "please enter valid number"
            }else{
                // proceed to compute the values
                var jibu = firstNumber.toDouble() * secondNumber.toDouble()
                mAnswer.text = jibu.toString()
            }

        }
        mDiv.setOnClickListener {
            // receive the first and second number to compute
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "please enter valid number"
            }else{
                // proceed to compute the values
                var jibu = firstNumber.toDouble() / secondNumber.toDouble()
                mAnswer.text = jibu.toString()
            }

        }
    }
}