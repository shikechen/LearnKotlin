package com.example.helloworld

open class Person(val name: String, val age: Int) {
//    var name = ""
//    var age = 0

    fun eat() {
        println(name + " is eating. He/She is " + age + " years old.")
    }
}