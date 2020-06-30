package ru.sberbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ZakupkaGen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zakupka_gen)
        setTitle("Создать Акт закупки")
    }

    fun sign_za(v: View){
        val intent = Intent(this, ZakupkaAct::class.java)
        startActivity(intent)
    }
}