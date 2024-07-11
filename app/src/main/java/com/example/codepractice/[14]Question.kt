package com.example.codepractice

fun main(){
    //[14] 사용자로부터 정수를 입력받아 해당 숫자에 대한 구구단을 출력하는 프로그램을 작성하세요.

    println("숫자를 입력해주세요")
    var num = readLine()!!.toInt()

    for (i in 1 .. 9){
        println("$num x $i = ${num*i}")
    }
}