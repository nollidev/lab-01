package com.example.petshop

class Cat(name: String, age: Int): Pet(name, age), Pettable {

    override fun speak(): String {
        return "Meow!"
    }

    override fun pet() {
        println("$name the cat is being pet!")
    }

}