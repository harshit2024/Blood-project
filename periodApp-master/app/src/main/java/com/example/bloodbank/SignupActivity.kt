package com.example.bloodbank

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {
    lateinit var btnRegister:Button
    lateinit var Login3:TextView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        getSupportActionBar()?.hide()
        title="Register"

//        val actionBar: ActionBar?
//        actionBar = supportActionBar
//        val colorDrawable = ColorDrawable(Color.parseColor("#DF5F56"))
//        actionBar!!.setBackgroundDrawable(colorDrawable)

        btnRegister=findViewById(R.id.btnregister)
        Login3=findViewById(R.id.login3)
        btnRegister.setOnClickListener {

            val intent = Intent(this,SignActivity::class.java)
            startActivity(intent)
        }
            Login3.setOnClickListener {

            val intent = Intent(this,SignActivity::class.java)
            startActivity(intent)
        }


        }

    }
