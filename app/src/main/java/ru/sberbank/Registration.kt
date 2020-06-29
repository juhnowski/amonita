package ru.sberbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckedTextView
import kotlinx.android.synthetic.main.activity_registration.view.*

class Registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        setTitle("Регистрация");
    }

    fun goto_email(v:View){
        val intent = Intent(this, email::class.java)
        startActivity(intent)
    }
}