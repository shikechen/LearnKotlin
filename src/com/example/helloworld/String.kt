package com.example.helloworld

fun String.lettersCount(): Int {
    var count = 0
    for (char in this) {
        if (char.isLetter()) {
            count++;
        }
    }

    return count
}

//fun getRandomLengthString(str: String): String {
//    val n = (1..20).random()
//    val builder = StringBuilder()
//    repeat(n) {
//        builder.append(str)
//    }
//
//    return builder.toString()
//}

fun getRandomLengthString(str: String) = str * (1..20).random()

//operator fun String.times(n: Int): String {
//    val builder = StringBuilder()
//    repeat(n) {
//        builder.append(this)
//    }
//
//    return builder.toString()
//}

operator fun String.times(n: Int) = repeat(n)