package com.example.arraylistactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = findViewById<EditText>(R.id.etName)
        val etNum = findViewById<EditText>(R.id.etNum)
        val addBtn = findViewById<Button>(R.id.addBtn)
        val getBtn = findViewById<Button>(R.id.getBtn)
        val tvText = findViewById<TextView>(R.id.tvText)
        val namesList = arrayListOf<String>()


            addBtn.setOnClickListener {
                namesList.add(etName.text.toString())
                etName.setText("")
            }


        getBtn.setOnClickListener {
            var index = etNum.text.toString().toInt()
            index-=1
            when {
             index > namesList.size ->  Toast.makeText(this, "Index does not exist" , Toast.LENGTH_LONG).show()
             else -> tvText.text = "Student Name is\n ${namesList[index]}"

            }
        }
    }
}