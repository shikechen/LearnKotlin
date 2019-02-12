import java.lang.Integer.parseInt
import java.util.*

//fun main(args: Array<String>) {
//    print("Hello Kotlin")
//}

/*
class Greeter(val name: String) {
    fun greet() {
        println("Warm welcome $name")
    }
}

fun main(args: Array<String>) {
    Greeter("Kotlin").greet()
}*//*

fun sum(a: Int, b: Int) = a + b*/

/*fun printSum(a: Int, b: Int): Unit {
    print(a + b)
}

fun vars(vararg v: Int) {
    for (vt in v) {
        print(vt)
    }
}

fun parseInt(str: String): Int? {
    // return can be null
}*/

fun getStringLength(obj: Any): Int? {
    /*if (obj is String) {
        return obj.length
    }

    if (obj !is String) {
        //
    }

    return null*/

    /*if (obj !is String) {
        return null
    }

    return obj.length*/

    if (obj is String && obj.length > 0)
        return obj.length

    return null
}

fun main(args: Array<String>) {
//    print(sum(3, 2))
//    vars(1,2,4,5,3)
//    val sumLambda: (Int, Int) -> Int = {x,y -> x + y}
//    print(sumLambda(5,6))

    /*val a: Int = 1
    val b = 1
    val c: Int
    c = 1

    var x = 5
    x += 1*/

    /*var a = 1
    val s1 = "a is $a"

    a = 2
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    print(s2)*/

    /*var age: String? = "12"
    val ages = age!!.toInt()
    val ages1 = age?.toInt()
    val ages2 = age?.toInt() ?: -1*/

    /*if (args.size < 2) {
        print("Two integers expected")
        return
    }

    val x = parseInt(args[0])
    val y = parseInt(args[1])

    if (x != null && y != null) {
        print(x * y)
    }*/

//    print(getStringLength("abc"))

    /*for (i in 1..5)
        print(i)

    for (i in 5..1)
        print(i)

    for (i in 1..10)
        println(i)*/

    for (i in 1..5 step 2)
        print(i)

    println()

    for (i in 5 downTo 1 step 2)
        print(i)

    println()

    for (i in 1 until 10)
        print(i)
}
