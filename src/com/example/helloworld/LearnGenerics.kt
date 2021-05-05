package com.example.helloworld

class MyClass<T> {
    fun method(param: T): T {
        return param
    }
}

class MyClass2 {
    fun <T> method(param: T): T {
        return param
    }
}

class MyClass3 {
    fun <T: Number> method(param: T): T {
        return param
    }
}