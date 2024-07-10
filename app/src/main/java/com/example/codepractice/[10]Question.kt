package com.example.codepractice

fun main() {
//    [10] 1부터 100까지의 숫자 중에서 사용자의 숫자를 입력받아 그 숫자가 2의 배수인지 3의배수인지 아무 배수도 아닌지(2, 3배수가 아닌)
//    찾는 코드 (출력: 2의배수, 3의배수, 둘다배수, 둘다아님)

    println("1 부터 100까지의 수를 입력해주세요")
    var num = readLine()!!.toInt()

    if (num in 1..100) {
        if (num % 2 == 0) {
            if (num % 3 == 0) {
                println("둘다 배수")
            } else println("2의 배수")
        } else if (num % 3 == 0) {
            println("3의 배수")
        } else println("둘다 아님")
    } else println("입력한 숫자가 1 부터 100까지의 수가 아닙니다.")
}