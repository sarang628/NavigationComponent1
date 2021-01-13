package com.example.myapplication.safeargs

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R

class SafeArgsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_safe_args)
    }

    companion object{
        fun go(context: Context){
            context.startActivity(Intent(context, SafeArgsActivity::class.java))
        }
    }
}