import strings.join
import strings.joinToString
import strings.lastChar

fun main(args: Array<String>) {
    println("Hello Kotlin")

    val set1 = hashSetOf(1, 5, 9)
    val list1 = arrayListOf(1, 5, 11)
    val map1 = hashMapOf(1 to "one", 7 to "seven", 11 to "eleven")

    println(set1.javaClass)
    println(list1.javaClass)
    println(map1.javaClass)

    //println(joinToString(list1, ";", "(", ")"))
    //println(joinToString(list1))
    //println(joinToString(list1, ";", "[", "]"))

    println("Kotlin".lastChar())
    println("Python3".lastChar)

    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '$'
    println(sb)


    println(list1.joinToString(separator = "; ", prefix = "(", postfix = ")"))
    println(listOf("One", "Two", "Three").join(" "))
    //println(listOf(1, 2, 3).join(" ")) // Type mismatch

    //println("12.345-6.A".split("\\.|-".toRegex()))
    println("12.345-6.A".split(".", "-"))
}

