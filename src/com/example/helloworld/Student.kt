package com.example.helloworld

class Student(val sno: String, val grade: Int, name: String, age: Int): Person(name, age) {
    constructor(name: String, age: Int) : this("", 0, name, age) {
    }

    constructor() : this("", 0) {

    }
//    var sno = ""
//    var grade = 0
    init {
        println("sno is " + sno)
        println("grade is " + grade)
    }
}

// 没有主构造函数时
class Student1 : Person {
    constructor(name: String, age: Int) : super(name, age)
}

class Student2(name: String, age: Int) : Person(name, age), Study {
    override fun readBooks() {
        println(name + " is reading.")
    }

//    override fun doHomework() {
//        println(name + " is doing homework.")
//    }
}