package com.example.responsi043

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_baru2.*

class ActivityBaru2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baru2)

        val id2 = idbaru.text
        val pass2 = passbaru.text

        registrasi.setOnClickListener(){
            Toast.makeText(this,"ANDA SUKSES REGISTRASI",Toast.LENGTH_LONG).show()
        }

        back2.setOnClickListener(){
            onBackPressed()
        }
    }
}
