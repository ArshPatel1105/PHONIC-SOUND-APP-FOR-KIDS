package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var alpha = Array<String>(size = 26) { "" }
        var j = 65
        for (i: Int in 0..25) {
            alpha[i] = Character.toString(j.toChar())
            j++
        }
        var adapter = ArrayAdapter<String>(applicationContext, android.R.layout.simple_dropdown_item_1line, alpha)



        gridview.adapter = adapter


        gridview.setOnItemClickListener{adapterView, view, i, l ->
            var intent = Intent(applicationContext, MainActivity2::class.java)
            intent.putExtra("name",alpha[i]);
            startActivity(intent)
        }
    }
}





