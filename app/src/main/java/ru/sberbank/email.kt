package ru.sberbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class email : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email)
        setTitle("Укажите Ваш Email");
    }

    fun goto_vhod_1(v: View){
        val intent = Intent(this, Vhod::class.java)
        startActivity(intent)
    }
}