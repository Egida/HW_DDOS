package com.timmitof.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.tvText)

        firstTextColor()
        }

    fun firstTextColor (){
        val spannableString = SpannableString(textView.text.toString())

        val fColor = ForegroundColorSpan(Color.BLUE)
        spannableString.setSpan(fColor, 0, 9, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        val sColor = ForegroundColorSpan(Color.RED)
        spannableString.setSpan(sColor, 10, 19, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        textView.text = spannableString
    }


}