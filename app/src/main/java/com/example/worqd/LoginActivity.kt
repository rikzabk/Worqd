package com.example.worqd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btn: Button = findViewById(R.id.button)

        btn.setOnClickListener {
            val intent= Intent(this@LoginActivity, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}