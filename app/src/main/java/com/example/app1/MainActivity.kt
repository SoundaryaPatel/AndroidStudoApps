package com.example.app1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShow.setOnClickListener {
            //CODE
            Log.i("MainActivity", "Button was clicked")
            Toast.makeText( this,"Button was clicked !", Toast.LENGTH_SHORT ).show()
        }
        btnSendMsg.setOnClickListener {
            val message=userMsg.text.toString()

            val intent=Intent(this,SecondActivity::class.java)
            intent.putExtra("user_message",message)
            startActivity(intent)
        }
    }
}
