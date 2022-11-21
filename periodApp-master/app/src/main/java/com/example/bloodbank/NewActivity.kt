package com.example.bloodbank

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class NewActivity : AppCompatActivity() {
    lateinit var imageButton: ImageButton
    private lateinit var Maps : ImageButton
    private lateinit var track : ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        getSupportActionBar()?.hide()

//        val actionBar: ActionBar?
//        actionBar = supportActionBar
//        val colorDrawable = ColorDrawable(Color.parseColor("#DF5F56"))
//        actionBar!!.setBackgroundDrawable(colorDrawable)







    }
}