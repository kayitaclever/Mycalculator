package com.example.cleverscalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var etfirstvalue: EditText? = null
    var etsecondvalue: EditText? = null
    var btnadd: Button? = null
    var btnsubs: Button? = null
    var btnmultiply: Button? = null
    var btnmodulus: Button? = null
    var num1: Double? = null
    var num2: Double? = null
    var tvresult: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etfirstvalue = findViewById(R.id.etfirstvalue)
        etsecondvalue = findViewById(R.id.etsecondvalue)
        btnadd = findViewById(R.id.btnadd)
        btnmodulus = findViewById(R.id.btnmodulus)
        btnmultiply = findViewById(R.id.btnmultiply)
        btnsubs = findViewById(R.id.btnsubs)
        tvresult = findViewById(R.id.tvresult)
        Clicklistener()
    }
    fun Clicklistener() {
        btnadd!!.setOnClickListener {
            num1 = etfirstvalue!!.text.toString().toDouble()
            num2 = etsecondvalue!!.text.toString().toDouble()
            val result = num1!! + num2!!
            tvresult!!.text = result.toString()
        }
        btnsubs!!.setOnClickListener {
                num1 = etfirstvalue!!.text.toString().toDouble()
                num2 = etsecondvalue!!.text.toString().toDouble()
                val result = num1!! - num2!!
                tvresult!!.text = result.toString()
            }
        btnmultiply!!.setOnClickListener {
            num1 = etfirstvalue!!.text.toString().toDouble()
            num2 = etsecondvalue!!.text.toString().toDouble()
            val result = num1!! * num2!!
            tvresult!!.text = result.toString()
        }
        btnmodulus!!.setOnClickListener {
            num1 = etfirstvalue!!.text.toString().toDouble()
            num2 = etsecondvalue!!.text.toString().toDouble()
            val result = num1!! %num2!!
            tvresult!!.text = result.toString()
        }
    }
}