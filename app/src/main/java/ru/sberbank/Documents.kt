package ru.sberbank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Documents : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_documents)
        setTitle("Документы")
    }
}