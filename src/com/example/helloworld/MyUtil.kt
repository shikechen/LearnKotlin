package com.example.helloworld

class MyUtil {
    fun doSometing() {
        println("Util doSomething")
    }

    companion object {

        @JvmStatic
        fun doSomething2() {
            println("Util doSomething2")
        }
    }
}