package com.example.whatsapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.chatlib.ChatLibrary

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val openChatButton = findViewById<Button>(R.id.openChatButton)
        openChatButton.setOnClickListener {
            ChatLibrary.start(this)
        }
    }
}