package com.example.myapplication

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        var name :String? = intent.getStringExtra(  "name")?.toLowerCase()
        Toast.makeText(applicationContext,name,Toast.LENGTH_LONG).show()

        var id :Int=resources.getIdentifier(name, "drawable",packageName)
        imageView.setImageResource(id)

        var mid :Int=resources.getIdentifier(name,  "raw",packageName)
        var mp: MediaPlayer = MediaPlayer.create(applicationContext,mid)
        mp.start()
    }
}