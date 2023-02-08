package com.example.kahootandroidapp.classes

class Users {
    private var username: String = ""
    private var totalPoints: Int = 0
    private var gameCode: String = ""
    private var optionSelected: String = ""

    constructor(username: String, totalPoints: Int, gameCode: String, optionSelected: String) {
        this.username = username
        this.totalPoints = totalPoints
        this.gameCode = gameCode
        this.optionSelected = optionSelected
    }
    constructor(){
        this.username = ""
        this.totalPoints = 0
        this.gameCode = ""
        this.optionSelected = ""
    }
    // getters and setters
    fun getOptionSelected(): String {
        return optionSelected
    }
    fun setOptionSelected(optionSelected: String) {
        this.optionSelected = optionSelected
    }
    fun getUsername(): String {
        return username
    }
    fun setUsername(username: String) {
        this.username = username
    }
    fun getTotalPoints(): Int {
        return totalPoints
    }
    fun setTotalPoints(totalPoints: Int) {
        this.totalPoints = totalPoints
    }
    fun getGameCode(): String {
        return gameCode
    }
    fun setGameCode(gameCode: String) {
        this.gameCode = gameCode
    }

}