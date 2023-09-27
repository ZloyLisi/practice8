package com.example.practice8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var count: Byte? = null//переменная для вычислений
    var num1: Double? = null//переменная,которая хранит первой значение для операций


    fun btnClick(view: View) {
        var b1: Button? = null
        if (view is Button) {
            b1 = view as Button
        }
        val textView: TextView = findViewById(R.id.textView)

        when (b1?.text) {

            "0" -> {
                if (textView.text == "0") {
                    textView.text = "0"

                }
                else textView.text = textView.text.toString() + "0"
            }
            "1" -> {
                if (textView.text == "0"){
                    textView.text = "1"

                }
                else textView.text = textView.text.toString() + "1"
            }
            "2" -> {
                if (textView.text == "0"){
                    textView.text = "2"

                }
                else textView.text = textView.text.toString() + "2"
            }
            "3" -> {
                if (textView.text == "0"){
                    textView.text = "3"

                }
                else textView.text = textView.text.toString() + "3"
            }
            "4" -> {
                if (textView.text == "0"){
                    textView.text = "4"

                }
                else textView.text = textView.text.toString() + "4"
            }
            "5" -> {
                if (textView.text == "0"){
                    textView.text = "5"

                }
                else textView.text = textView.text.toString() + "5"
            }
            "6" -> {
                if (textView.text == "0"){
                    textView.text = "6"

                }
                else textView.text = textView.text.toString() + "6"
            }
            "7" -> {
                if (textView.text == "0"){
                    textView.text = "7"

                }
                else textView.text = textView.text.toString() + "7"
            }
            "8" -> {
                if (textView.text == "0"){
                    textView.text = "8"

                }
                else textView.text = textView.text.toString() + "8"
            }
            "9" -> {
                if (textView.text == "0"){
                    textView.text = "9"

                }
                else textView.text = textView.text.toString() + "9"
            }
            "С" -> {
                textView.text = ""


            }
            "=" -> {


                val num2: Double = textView.text.toString().toDouble()

                when (count) {
                    1.toByte() -> {
                        val result = (num1!! + num2)
                        textView.text = if (result.toInt().toDouble() == result) {
                            result.toInt().toString()
                        } else {
                            result.toString()
                        }
                    }
                    2.toByte() -> {
                        val result = (num1!! - num2)
                        textView.text = if (result.toInt().toDouble() == result) {
                            result.toInt().toString()
                        } else {
                            result.toString()
                        }
                    }
                    3.toByte() -> {
                        val result = (num1!! * num2)
                        textView.text = if (result.toInt().toDouble() == result) {
                            result.toInt().toString()
                        } else {
                            result.toString()
                        }
                    }
                    4.toByte() -> {
                        val result = (num1!! / num2)
                        textView.text = if (result.toInt().toDouble() == result) {
                            result.toInt().toString()
                        } else {
                            result.toString()
                        }
                    }
                    /*от строчки 109 до 140 идёт операции вычисления
                    и проверка, если результат будет вещественным, то вывод
                    будет с точкой (пример 5/2 = 2.5), если же целочисленным,
                    то вывод без точки (пример 4/2 = 2)
                     */
                }

            }

        }
    }
    fun btnOperations(view: View) {
        var b1: Button? = null
        if (view is Button) {
            b1 = view as Button
        }
        val textView: TextView = findViewById(R.id.textView)
        num1 = textView.text.toString().toDouble()
        textView.text = ""


        when (b1?.text) {
            "+" -> count = 1
            "-" -> count = 2
            "*" -> count = 3
            "/" -> count = 4
        }
    }

}