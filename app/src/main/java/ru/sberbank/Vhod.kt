package ru.sberbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Vhod : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vhod)
        setTitle("Введите ID");
    }

    fun goto_repair(v: View){
        val intent = Intent(this, Reapir::class.java)
        startActivity(intent)
    }

    fun goto_client(v: View){
        val intent = Intent(this, Client::class.java)
        startActivity(intent)
    }
}