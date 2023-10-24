package com.exercise.git

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cleartext(view: View) {
        var txt = this.findViewById<EditText>(R.id.UserName)
        txt.text.clear()
    }

    fun showToast(view: View) {

        var txt = this.findViewById<EditText>(R.id.UserName).text

        Toast.makeText(applicationContext,"WelCome dear ${txt}", Toast.LENGTH_LONG).show()
    }

}