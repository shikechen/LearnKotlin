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

// build.kt
fun <T> T.build(block: T.() -> Unit): T {
    block()
    return this
}

//fun learnAndroid() {
//    val editor = getSharedPreference("data", Context.MODE_PRIVATE).edit()
//    editor.putString("name", "Lucky")
//    editor.putInt("age", 29)
//    editor.putBoolean("married", false)
//    editor.apply()
//
//    getSharedPreference("data", Context.MODE_PRIVATE).open {
//        putString("name", "Lucky")
//        putInt("age", 29)
//        putBoolean("married", false)
//    }
//}

//fun SharedPreferences.open(block: SharedPreferences.Editor.() -> Unit) {
//    val editor = edit()
//    editor.block()
//    editor.apply()
//}