package ru.sberbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Punkts : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_punkts)
        setTitle("Ближайшие пункты")
    }

    fun show_favorites(v:View){
        val intent = Intent(this, FPunkts::class.java)
        startActivity(intent)
    }
}