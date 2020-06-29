package ru.sberbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar

class SendMessage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_message)
        setTitle("Обратная связь")
    }

    fun send_message(v: View){
           Snackbar.make(v, "Сообщение отправлено", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
    }
}