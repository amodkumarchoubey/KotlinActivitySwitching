package com.amod.kotlinactivityswitching

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var editname: EditText
    lateinit var btnname: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editname = (findViewById(R.id.edt_name))
        btnname = (findViewById(R.id.btn_name))
        btnname.setOnClickListener(this)

    }

    companion object{
       const val KEY_NAME="name"
    }
    override fun onClick(p0: View?) {
        val intent = Intent(this, SecondActivity::class.java)
        val name:String=editname.text.toString()
        intent.putExtra(KEY_NAME,name)
        startActivity(intent)
        print(name)

    }
}