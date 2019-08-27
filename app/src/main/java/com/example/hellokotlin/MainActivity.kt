package com.example.hellokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckedTextView
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.makeText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openNewLayout(view: View) {
        val activ = Intent(this, SecondActivity::class.java)
        startActivity(activ)

        //val show = Toast.makeText(this, "Ёбаный рот этого казино, блять!", Toast.LENGTH_SHORT)
        //show.show()
    }
}
