package com.example.kahootandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kahootandroidapp.controller.DBConnection
import com.example.kahootandroidapp.classes.Users

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = Users()
        user.setUsername("Javier Aguilera")
        user.setGameCode("XBUY")
        user.setOptionSelected("A")

        DBConnection().addUser(user)

    }
}