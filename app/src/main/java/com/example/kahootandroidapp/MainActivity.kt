package com.example.kahootandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.kahootandroidapp.controller.DBConnection
import com.example.kahootandroidapp.classes.Users

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sendButton()

    }

    private fun sendButton() {
        val sendButton = findViewById<Button>(R.id.button_send)
        val gameCode = findViewById<EditText>(R.id.editTextGameCode)
        val username = findViewById<EditText>(R.id.editTextUsername)

        sendButton.setOnClickListener(){
            val user = Users()
            user.setUsername(username.text.toString())
            user.setGameCode(gameCode.text.toString())
            if (!DBConnection().addUserToGame(user)) {
                toastMessage("Game code does not exist")
            }
        }
    }

    private fun toastMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}