package com.example.lenovo.fqq;
import android.R
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.EventDetail

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_content)
        val button = findViewById(R.id.list_container)as Button
        button.setOnClickListener {
            val intent = Intent(this@Main3Activity, EventDetail::class.java)
            startActivity(intent)
        }
        val a = supportActionBar
        a?.hide()
    }
}
