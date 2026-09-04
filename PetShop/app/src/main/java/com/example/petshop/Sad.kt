package com.example.petshop

class Sad(date: String): Mood(date) {

    override fun expression(): String {
        return "I am very sad. Boohoo!"
    }

}