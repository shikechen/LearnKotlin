class Person {

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
}

/*public class MyTest {
    lateinit var subject: TestSubject

    @SetUp fun setup() {
        subject = TestSubject()
    }

    @Test fun test() {
        subject.method()
    }
}*/

fun main(args: Array<String>) {
    var person: Person = Person()

    person.lastName = "Wu"
    println("lastName:${person.lastName}")

    person.no = 9
    println("no:${person.no}")

    person.no = 20
    println("no:${person.no}")

    println("height:${person.height}")
}