/*class Person {

    var lastName: String = "Chen"
        get() = field.toUpperCase()
        set

    var no: Int = 100
        get() = field
        set(value) {
            if (value < 10) {
                field = value
            } else {
                field = -1
            }
        }

    var height: Float = 173f
        private set
}*/

class GitHub constructor(name: String) {

    var url: String = "https://www.github.com"
    var country: String = "US"
    var siteName = name

    init {
        println("init name: $name")
    }

    constructor(name: String, alexa: Int) : this(name) {
        println("Alexa rank: $alexa")
    }

    fun printSomething() {
        println("I am class's fun")
    }
}

open class Base {
    open fun f() {}
}

abstract class Derived : Base() {
    abstract override fun f()
}

class Outer {
    private val bar: Int = 1
    class Nested {
        fun foo() = 2
    }
}

class OuterInner {
    private val bar: Int = 1
    var v = "var v"

    inner class Inner {
        fun foo() = bar
        fun innerTest() {
            var o = this@OuterInner
            println("Can access " + o.v)
        }
    }
}

class Test {
    var v = "var v"

    fun setInterface(test: TestInterface) {
        test.test()
    }
}

interface TestInterface {
    fun test()
}


fun main(args: Array<String>) {
    /*var person: Person = Person()

    person.lastName = "Wu"
    println("lastName:${person.lastName}")

    person.no = 9
    println("no:${person.no}")

    person.no = 20
    println("no:${person.no}")

    println("height:${person.height}")*/

    /*val github = GitHub("People who build software", 99)
    println(github.siteName)
    println(github.url)
    println(github.country)
    github.printSomething()*/

    println(Outer.Nested().foo()) // invoke nested class

    println(OuterInner().Inner().foo())
    println(OuterInner().Inner().innerTest())

    var test = Test()
    test.setInterface(object : TestInterface {
        override fun test() {
            println("interface")
        }
    })
}