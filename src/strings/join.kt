package strings

fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0)
            result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun Collection<String>.join(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
) = joinToString(separator, prefix, postfix)

//fun <T> joinToString(
//    collection: Collection<T>,
//    separator: String = ", ",
//    prefix: String = "(",
//    postfix: String = ")"
//): String {
//    val result = StringBuilder(prefix)
//
//    for ((index, element) in collection.withIndex()) {
//        if (index > 0)
//            result.append(separator)
//        result.append(element)
//    }
//
//    result.append(postfix)
//    return result.toString()
//}

//fun <T> joinToString(
//    collection: Collection<T>,
//    separator: String,
//    prefix: String,
//    postfix: String
//): String {
//    val result = StringBuilder(prefix)
//
//    for ((index, element) in collection.withIndex()) {
//        if (index > 0)
//            result.append(separator)
//        result.append(element)
//    }
//
//    result.append(postfix)
//    return result.toString()
//}

fun String.lastChar(): Char = get(length - 1)

val String.lastChar: Char
    get() = get(length - 1)

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value) {
        setCharAt(length - 1, value)
    }
