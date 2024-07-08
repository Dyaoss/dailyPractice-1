package com.example.codepractice

fun main(){
    // [9] down to 를 활용하여 20이하 짝수 출력하기 (출력예: 20,18,16……..)

    println("20이하의 수를 입력해주세요.")
    var num = readLine()!!.toInt()

    for(i in 20 downTo 1 step 2){
        print("$i ")
    }
}