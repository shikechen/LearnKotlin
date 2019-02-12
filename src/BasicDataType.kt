/*fun decimalDigitValue(c: Char): Int {
    if (c !in '0'..'9')
        throw IllegalArgumentException("Out of range")

    return c.toInt()
}*/

fun main(args: Array<String>) {
    /*val a: Int = 10000
    println(a == a)

    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    println(boxedA === anotherBoxedA) // compare address
    println(boxedA == anotherBoxedA) // compare value*/

    /*val b: Byte = 1
    val i: Int = b.toInt()

    val l = 1L + 3*/

    /*val a = arrayOf(1, 2, 3)
    val b = Array(3, { i -> (i * 2)})

    println(a[0])
    println(b[1])*/

    /*val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2]
    println(x[0])*/

    /*val str = "Kotlin"
    for (s in str)
        println(s)*/

    /*val text = """
        1 line
        2 line
        3 line
    """
    println(text)*/

    /*val text = """
        |1 line
        |2 line
        |3 line
        |4 line
    """.trimMargin()
    println(text)*/

    /*val i = 10
    val s = "i = $i"
    println(s)*/

    /*val s = "Kotlin"
    val str = "$s.length is ${s.length}"
    println(str)*/

    val price = """
        ${'$'}99.99
    """
    println(price)
}