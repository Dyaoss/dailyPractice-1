package com.example.codepractice

fun main() {
    //[11] 2부터 100까지의 숫자 중에서 소수들의 합을 계산하세요.
    var sum = 0
    for (num in 2 .. 100){
        if(isPrime(num)){
            sum += num
        }
    }
    println(sum)
}

fun isPrime(num: Int): Boolean {
    if (num <= 1) {
        return false
    }
    for (i in 2 until num) {
        if (num % i == 0) {
            return false
        }
    }
    return true
}