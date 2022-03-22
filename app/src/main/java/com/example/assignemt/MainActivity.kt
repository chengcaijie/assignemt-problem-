package com.example.assignemt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnlogin = findViewById<Button>(R.id.btnLgn)
        val editName = findViewById<EditText>(R.id.edname)
        val editPass = findViewById<EditText>(R.id.edpass)
        val register = findViewById<TextView>(R.id.registerbtn)
        
        btnlogin.setOnClickListener{

            if(editName.text.trim().isNotEmpty() || editPass.text.trim().isNotEmpty()){
                //
                Toast.makeText(this, "Welcome back !!", Toast.LENGTH_SHORT).show()

            }else{
                Toast.makeText(this, "Input Required !!", Toast.LENGTH_SHORT).show()
            }
        }

        register.setOnClickListener{
            val intent = Intent(this, Rgister::class.java);
            startActivity(intent)
        }
    }
}