fun main(args: Array<String>) {
    /*val items = listOf("Apple", "Banana", "Cherry")
    for (item in items) {
        println(item)
    }

    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }*/

    /*var x = 5
    while (x > 0) {
        println(x--)
    }*/

    /*var y = 5
    do {
        println(y--)
    } while (y > 0)*/

    /*loop@ for (i in 1..10) {
        if (i == 3)
            continue

        println(i)

        if (i > 5)
            break
    }*/

    for (i in 1..10)
        print(i)

    println()

    for (i in 10 downTo 1)
        print(i)

    println()

    for (i in 1..10 step 2)
        print(i)

    println()

    for (i in 10 downTo 1 step 2)
        print(i)

    println()

    for (i in 1 until 10)
        print(i)
}