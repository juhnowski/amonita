package ru.sberbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar

class PunktDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_punkt_details)
        setTitle("ООО ПРОГРЕСС")
    }

    fun show_documents(v:View){
        val intent = Intent(this, Documents::class.java)
        startActivity(intent)
    }

    fun show_presentation(v:View){
        val intent = Intent(this, Presentation::class.java)
        startActivity(intent)
    }

    fun add_to_favorites(v:View){
        Snackbar.make(v, "Закупочный пункт добавлен в Избранное", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
    }

    fun sign_act(v:View){
        val intent = Intent(this, ZakupkaAct::class.java)
        startActivity(intent)
    }
}