package ru.sberbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ZakupkaAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zakupka)
        setTitle("Закупочный Акт")
    }

    fun on_signed(v: View){
        val intent = Intent(this, PunktDetails::class.java)
        startActivity(intent)
    }
}