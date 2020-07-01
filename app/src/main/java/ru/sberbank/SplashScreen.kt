package ru.sberbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        setTitle("СоБЕРУ.ру - прототип");
    }

    fun do_next(v:View){
        val intent = Intent(this, RegVhod::class.java)
        startActivity(intent)

    }

}