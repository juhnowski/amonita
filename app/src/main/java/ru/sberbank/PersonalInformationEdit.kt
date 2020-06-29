package ru.sberbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class PersonalInformationEdit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personal_information_edit)
    }

    fun goto_client(v: View){
        val intent = Intent(this, Client::class.java)
        startActivity(intent)
    }
}