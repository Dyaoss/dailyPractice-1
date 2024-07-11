package com.example.codepractice

fun main() {
    //[13] 1부터 100까지의 숫자 중에서 홀수의 곱을 계산하세요.
    var multiple = 1L
    for (i in 1..100 step 2) {
        multiple *= i
    }
    println(multiple)
}