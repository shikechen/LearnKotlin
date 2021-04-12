package com.example.helloworld

import kotlin.math.max

fun main() {
    println("Hello Kotlin!")
    println("20210411")

    var a : Int = 10
    a = a * 10
    println("a = " + a)

    val b = 33
    val c = 32
    val value = largeNumber(b, c)
    println("large number is " + value)

    val name = "Shike"
    val score = getScore(name)
    println(name + "\'s score is " + score)

//    val num = 10
    val num = 10L
    checkNumber(num)

    val name2 = "Smiles"
    val score2 = getScore2(name2)
    println(name2 + "\'s score is " + score2)

//    for (i in 0..10) {
//        println(i)
//    }
//    for (i in 0 until 10) {
//        println(i)
//    }
//    for (i in 0 until 10 step 2) {
//        println(i)
//    }
//    for (i in 10 downTo 1) {
//        println(i)
//    }
    for (i in 10 downTo 1 step 3) {
        println(i)
    }

//    val person = Person()
//    person.name = "Jack"
//    person.age = 29
//    person.eat()

    val stu = Student("H123", 10, "Hello", 20)
    stu.eat()

//    val stu1 = Student()
//    val stu2 = Student("Hello", 20)

    val stu3 = Student2("Hello", 20)
    doStudy(stu3)

    val phone1 = Cellphone("Huawei", 6499)
    val phone2 = Cellphone("Xiaomi", 3999)
    println(phone1)
    println("phone1 equals phone2: " + (phone1 == phone2))

    Singleton.test()
}

//fun largeNumber(num1 : Int, num2 : Int): Int {
//    return max(num1, num2)
//}

//fun largeNumber(num1 : Int, num2 : Int) = max(num1, num2)

//fun largeNumber(num1: Int, num2: Int): Int {
//    var value = 0
//    if (num1 > num2) {
//        value = num1
//    } else {
//        value = num2
//    }
//    return value
//}

//fun largeNumber(num1: Int, num2: Int): Int {
//    val value = if (num1 > num2) {
//        num1
//    } else {
//        num2
//    }
//    return value
//}

fun largeNumber(num1: Int, num2: Int) = if (num1 > num2) num1 else num2

//fun getScore(name: String) = if (name == "Tom") {
//    80
//} else if (name == "Shike") {
//    90
//} else if (name == "Hello") {
//    85
//} else {
//    0
//}

fun getScore(name: String) = when (name) {
    "Tome" -> 80
    "Shike" -> 90
    "Hello" -> 85
    else -> 0
}

fun checkNumber(num: Number) {
    when(num) {
        is Int -> println("number is Int")
        is Double -> println("number is Double")
        else -> println("number not support")
    }
}

fun getScore2(name: String) = when {
    name == "Tome" -> 80
    name == "Shike" -> 90
    name == "Hello" -> 85
    name.startsWith("Smiles") -> 95
    else -> 0
}

fun doStudy(study: Study) {
    study.readBooks()
    study.doHomework()
}