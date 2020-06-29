package ru.sberbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Reapir : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reapir)
        setTitle("Укажите ваш Email");
    }

    fun goto_vhod_2(v: View){
        val intent = Intent(this, Vhod::class.java)
        startActivity(intent)
    }
}