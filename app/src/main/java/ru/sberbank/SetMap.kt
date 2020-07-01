package ru.sberbank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SetMap : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_map)
        setTitle("Привязать карту")
    }
}