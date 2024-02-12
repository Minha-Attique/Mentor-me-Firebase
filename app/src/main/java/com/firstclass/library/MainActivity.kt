package com.firstclass.library

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.content.Intent
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val next = findViewById<Button>(R.id.buttonLogin)
        next.setOnClickListener{
            startActivity(
                Intent(this,MainActivity4::class.java)
            );
        }


    }


}
