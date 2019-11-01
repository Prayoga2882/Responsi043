package com.example.responsi043

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val id = id.text
        val password = pass.text


            login.setOnClickListener() {
                intent = Intent(this, ActivityBaru::class.java)

                if (id.toString() == "prayoga043" && password.toString() == "123") {
                    startActivity(intent)
                }else {
                    login.setOnClickListener(){
                        Toast.makeText(this, "ANDA GAGAL LOGIN", Toast.LENGTH_LONG).show()}
                }
            }

        register.setOnClickListener(){
            intent = Intent(this, ActivityBaru2::class.java)
            startActivity(intent)

        }
    }

}

