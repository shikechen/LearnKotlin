package com.example.helloworld

fun num1AndNum2(num1: Int, num2: Int, operation: (Int, Int) -> Int) : Int {
    val result = operation(num1, num2)
    return result
}

fun plus(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun minus(num1: Int, num2: Int): Int {
    return num1 - num2
}

fun example(func: (String, Int) -> Unit) {
    func("Hello", 123)
}

fun StringBuilder.build(block: StringBuilder.() -> Unit): StringBuilder {
    block()
    return this
}