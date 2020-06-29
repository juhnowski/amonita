package ru.sberbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class FPunkts : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_f_punkts)
        setTitle("Избранные пункты")
    }

    fun show_details_of_favorites(v: View){
        val intent = Intent(this, PunktDetails::class.java)
        startActivity(intent)
    }

}