package strings

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
//    if (user.name.isEmpty()) {
//        throw IllegalArgumentException("Can't save user ${user.id}: empty name")
//    }
//
//    if (user.address.isEmpty()) {
//        throw IllegalArgumentException("Can't save user ${user.id}: empty address")
//    }

//    fun validate(user: User,
//                 value: String,
//                 fieldName: String) {
//        if (value.isEmpty()) {
//            throw IllegalArgumentException("Can't save user ${user.id}: empty $fieldName")
//        }
//    }
//
//    validate(user, user.name, "name")
//    validate(user, user.address, "address")

//    fun validate(value: String, fieldName: String) {
//        if (value.isEmpty()) {
//            throw IllegalArgumentException("Can't save user ${user.id}: empty $fieldName")
//        }
//    }
//
//    validate(user.name, "name")
//    validate(user.address, "address")

    user.validateBeforeSave()
}

fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user $id: empty $fieldName")
        }
    }

    validate(name, "name")
    validate(address, "address")
}



fun main(args: Array<String>) {
    saveUser(User(1, "a", ""))
}