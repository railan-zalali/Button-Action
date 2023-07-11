package com.example.a212101005_railan_abdul_zalali

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


// contoh kode Kotlin untuk MainActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun clickProfile(view: View){
        val intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)
    }
    fun clickLogout(view: View){
        // tombol logout
    }

}
