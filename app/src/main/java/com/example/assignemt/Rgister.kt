package com.example.assignemt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Rgister : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rgister)

        val editName = findViewById<EditText>(R.id.edusername)
        val editEmail = findViewById<EditText>(R.id.edEmail)
        val editPass : String =findViewById<EditText>(R.id.edpass).text.toString()
        val editComfirmPass : String = findViewById<EditText>(R.id.edComfirmpass).text.toString()
        val registerbtn = findViewById<Button>(R.id.btnRgis)

        registerbtn.setOnClickListener {
            if (editName.text.isNotEmpty() && editEmail.text.isNotEmpty() && editPass.isNotEmpty() && editComfirmPass.isNotEmpty()
            ) {
                if (editPass.toString() == editComfirmPass.toString() ){
                    Toast.makeText(this, "We Welcome you to our app !!", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, profile::class.java);
                    startActivity(intent);
                }else{
                    Toast.makeText(this, "The Password does not match !!", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Input Required !!", Toast.LENGTH_SHORT).show()
            }

        }
        val loginbtn = findViewById<TextView>(R.id.lgnbtn)
        loginbtn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java);
            startActivity(intent);
        }
    }
}