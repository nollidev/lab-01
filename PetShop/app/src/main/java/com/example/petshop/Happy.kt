package com.example.petshop

class Happy(date: String): Mood(date) {

    override fun expression(): String {
        return "I'm having a great day. Yippee!!"
    }

}