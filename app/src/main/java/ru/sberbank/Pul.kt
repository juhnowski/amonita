package ru.sberbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Pul : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pul)
        setTitle("Реквизиты Юр.Лица")
    }

    fun goto_client_from_pul(v: View){
        val intent = Intent(this, Client::class.java)
        startActivity(intent)
    }
}