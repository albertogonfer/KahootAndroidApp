package com.example.kahootandroidapp.controller

import android.content.Context
import android.widget.Toast
import com.example.kahootandroidapp.MainActivity
import com.example.kahootandroidapp.classes.Users
import com.google.firebase.database.FirebaseDatabase

class DBConnection {
    private val database = FirebaseDatabase.getInstance().reference

    fun addUserToGame(user: Users): Boolean {
        var operationSuccess = false
        var gamesRef = database.child("Games").child(user.getGameCode())
        gamesRef.get().addOnSuccessListener {
            if (it.exists()) {
                gamesRef = database.child("Games").child(user.getGameCode()).child("Users")
                gamesRef.child(user.getUsername()).setValue(user.getTotalPoints().toString() + " pts")
                operationSuccess = true
            }
        }
        return operationSuccess
    }
}