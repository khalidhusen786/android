package com.example.q2_setb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rbmale=findViewById<RadioButton>(R.id.radioButton)
        var rbfemale=findViewById<RadioButton>(R.id.radioButton1)
        var chkbox=findViewById<CheckBox>(R.id.checkbox)
        var btn=findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            if (rbmale.text=="Male" && rbmale.isChecked)  {
                Toast.makeText(applicationContext ,"User select male", Toast.LENGTH_SHORT).show()

            }
            else if (rbfemale.text=="Female" && rbfemale.isChecked){
                Toast.makeText(applicationContext ,"User select female", Toast.LENGTH_SHORT).show()
            }

            if (chkbox.isChecked){
                Toast.makeText(applicationContext ,"User accepted term and condition", Toast.LENGTH_SHORT).show()

            }
        }
    }
}