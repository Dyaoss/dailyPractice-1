package com.example.codepractice

import java.lang.StringBuilder

fun main() {
    var sb = StringBuilder()
    var num1 = readLine()!!.toInt()
    var num2 = readLine()!!.toInt()
    var num3 = readLine()!!.toInt()
    var num4 = readLine()!!.toInt()
    var num5 = readLine()!!.toInt()

    sb.append(num1)
    sb.append(num2)
    sb.append(num3)
    sb.append(num4)
    sb.append(num5)

    var char = sb.toString().toCharArray()
    print(char.min())

}

