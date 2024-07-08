package com.example.codepractice

fun main(){
//    [8] 1부터 입력한 값을 모두 더하는 코드 만들기 (ex : 입력한 값이 5 라면 15가 출력됩니다.)

    println("숫자를 입력해주세요.")
    var num = readLine()!!.toInt()
    var sum = 0

    for(i in 0 .. num){
        sum += i
    }

    println("1부터 ${num}까지 더한 수는 ${sum} 입니다.")
}
