package com.example.helloworld

import kotlin.text.StringBuilder

fun main() {
    val list = ArrayList<String>()
    list.add("Apple")
    list.add("Banana")
    list.add("Cherry")
    list.add("Melon")

//    val list2 = listOf("Apple", "Banana", "Cherry", "Melon")
//    for (fruit in list2) {
//        println(fruit)
//    }

    val list3 = mutableListOf("Apple", "Banana", "Cherry", "Melon")
    list3.add("Pear")
//    for (fruit in list3) {
//        println(fruit)
//    }

    val set = setOf("Apple", "Banana", "Cherry", "Melon")
    for (fruit in set) {
        println(fruit)
    }

    val map = HashMap<String, Int>()
//    map.put("Apple", 1)
//    map.put("Banana", 2)
//    map.put("Cherry", 3)
//    map.put("Melon", 4)

    map["Apple"] = 1
    map["Banana"] = 2
    map["Cherry"] = 3
    map["Melon"] = 4

    val number = map["Apple"]
    println("number is " + number)

    val map2 = mapOf("Apple" to 1, "Banana" to 2, "Cherry" to 3, "Melon" to 4)
    for ((fruit, number) in map2) {
        println("fruit is " + fruit + ", number is " + number)
    }

    println("============")
    val list2 = listOf("Apple", "Banana", "Cherry", "Watermelon")
//    val maxLengthFruit = list2.maxBy { it.length }
//    println("max length fruit is " + maxLengthFruit)

//    val lambda = {fruit: String -> fruit.length}
//    val maxLengthFruit = list.maxBy(lambda)

//    val maxLengthFruit = list.maxBy({fruit: String -> fruit.length})
//    val maxLengthFruit = list.maxBy() { fruit: String -> fruit.length }
//    val maxLengthFruit = list.maxBy { fruit: String -> fruit.length }
//    val maxLengthFruit = list.maxBy { fruit -> fruit.length }
    val maxLengthFruit = list.maxBy { it.length }

//    val newList = list2.map { it.toUpperCase() }
//    for (fruit in newList) {
//        println(fruit)
//    }

//    val newList2 = list2.filter { it.length < 6 }
//                        .map { it.toUpperCase() }
//    for (fruit in newList2) {
//        println(fruit)
//    }

    val anyResult = list2.any { it.length < 6 }
    val allResult = list2.all { it.length < 6 }
    println("anyResult is " + anyResult + ", allResult is " + allResult)

//    Thread(object : Runnable {
//        override fun run() {
//            println("Thread is running")
//        }
//    }).start()

//    Thread(Runnable {
//        println("Thread is running")
//    }).start()

//    Thread({
//        println("Thread is running")
//    }).start()

//    Thread(){
//        println("Thread is running")
//    }.start()

    Thread {
        println("Thread is running")
    }.start()

    println("============")

    val list4 = listOf("Apple", "Banana", "Cherry", "Melon")
//    val builder = StringBuilder()
//    builder.append("Start eating fruits.\n")
//    for (fruit in list4) {
//        builder.append("Eating $fruit\n")
//    }
//    builder.append("Game end")
//    val result = builder.toString()
//    println(result)

    val result = with(StringBuilder()) {
        append("Start eating fruits.\n")
        for (fruit in list4) {
            append("Eating $fruit\n")
        }
        append("Game end")
        toString()
    }
    println(result)

    val result2 = StringBuilder().run {
        append("Start eating fruits.\n")
        for (fruit in list4) {
            append("Eating $fruit\n")
        }
        append("Game end")
        toString()
    }
    println(result2)

    val result3 = StringBuilder().apply {
        append("Start eating fruits.\n")
        for (fruit in list4) {
            append("Eating $fruit\n")
        }
        append("Game end")
    }
    println(result3.toString())

    val num1 = 100
    val num2 = 80
//    val result11 = num1AndNum2(num1, num2, ::plus)
//    val result12 = num1AndNum2(num1, num2, ::minus)
    val result11 = num1AndNum2(num1, num2) { n1, n2 ->
        n1 + n2
    }
    val result12 = num1AndNum2(num1, num2) { n1, n2 ->
        n1 - n2
    }
    println("result1 is $result11, result2 is $result12")

    val result4 = StringBuilder().build {
        append("Start eating fruits.\n")
        for (fruit in list4) {
            append("Eating $fruit\n")
        }
        append("Game end")
    }
    println(result4.toString())
}