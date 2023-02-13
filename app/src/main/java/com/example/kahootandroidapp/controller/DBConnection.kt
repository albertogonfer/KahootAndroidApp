package com.example.kahootandroidapp.controller

import com.example.kahootandroidapp.classes.Users
import com.google.firebase.database.FirebaseDatabase

class DBConnection {
    private val database = FirebaseDatabase.getInstance().reference

    fun addUserToGame(user: Users) {
        val gamesRef = database.child("Games").child(user.getGameCode()).child("Participants")

        gamesRef.child(user.getUsername()).setValue(user.getTotalPoints().toString() + "pts")
    }
}