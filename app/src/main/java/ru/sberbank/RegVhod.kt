package ru.sberbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RegVhod : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg_vhod)
        setTitle("Выберите действие");
    }

    fun goto_registration(v: View){
        val intent = Intent(this, Registration::class.java)
        startActivity(intent)
    }

    fun goto_vhod(v: View){
        val intent = Intent(this, Vhod::class.java)
        startActivity(intent)
    }

}