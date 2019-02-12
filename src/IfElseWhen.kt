fun hasPrefix(x: Any) = when(x) {
    is String -> x.startsWith("prefix_")
    else -> false
}

fun main(args: Array<String>) {
    //val a = 0
    //val b = 0
    /*var max = a
    if (a < b)
        max = b*/

    /*var max: Int
    if (a > b) {
        max = a
    } else {
        max = b
    }*/

    //val max = if (a > b) a else b

    /*val max = if (a > b) {
        print("a is bigger")
        a
    } else {
        print("b is bigger")
        b
    }*/

    //val c = if (condition) a else b

    /*var x = 0
    if (x > 0) {
        println("x > 0")
    } else if (x == 0) {
        println("x == 0")
    } else {
        println("x < 0")
    }

    var a = 1
    var b = 2
    val c = if (a >= b) a else b
    println("c's value: $c")*/

    /*val x = 5
    val y = 9
    if (x in 1..8) {
        println("x in range")
    } else {
        println("x not in range")
    }*/

    //val x = 0
    /*when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> println("x != 1 and x != 2")
    }*/

    /*when (x) {
        0, 1 -> println("x == 0 or x == 1")
        else -> println("others")
    }*/

    /*when (x) {
        in 1..10 -> println("x in 1..10")
        !in 10..20 -> println("x not in 10..20")
        else -> println("else")
    }*/

    /*val str = "prefix_kotlin"
    println(hasPrefix(str))*/

    val items = setOf("Apple", "Banana", "Cherry")
    when {
        "Orange" in items -> println("Give me an orange juice")
        "Apple" in items -> println("Apple is delicious, especially iPhone>_^")
    }
}