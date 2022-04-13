package com.amod.kotlinactivityswitching

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.amod.kotlinactivityswitching.MainActivity.Companion.KEY_NAME

class SecondActivity : AppCompatActivity() {
    lateinit var txtname: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        txtname = (findViewById(R.id.txt_name))
        val intentobj : Intent=intent
        val name=intentobj.getStringExtra(KEY_NAME)
        print(name)
        txtname.text="Your name is : $name"

    }
}