package com.example.helloworld

import java.lang.Exception
import java.lang.IllegalArgumentException

//interface MyResult
//class Success(val msg: String) : MyResult
//class Error(val error: Exception) : MyResult
//
//fun getMyResultMsg(result: MyResult) = when (result) {
//    is Success -> result.msg
//    is Error -> result.error
//    else -> throw IllegalArgumentException()
//}

sealed class MyResult
class Success(val msg: String) : MyResult()
class Error(val error: Exception) : MyResult()
fun getMyResultMsg(result: MyResult) = when (result) {
    is Success -> result.msg
    is Error -> result.error
}