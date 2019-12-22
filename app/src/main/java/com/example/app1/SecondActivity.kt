package com.example.app1

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity: AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle:Bundle?= intent.extras
        val message =bundle!!.getString("user_message")
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

        txvUserMsg.text=message
    }
}