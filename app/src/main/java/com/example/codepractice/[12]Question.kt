package com.example.codepractice

fun main() {
    //[12] 사용자로부터 두 숫자를 입력받아, 첫 번째 숫자부터 두 번째 숫자까지의 모든 숫자를 더한 값을 출력하는 프로그램을 작성하세요.
    // 입력 : 19, 16, 출력: 70

    println("숫자 두개를 입력해주세요")
    print("첫번째 숫자: ")
    var num1 = readLine()!!.toInt()
    print("두번쨰 숫자: ")
    var num2 = readLine()!!.toInt()
    var sum = 0

    if (num1 < num2) {
        for (i in num1..num2) {
            sum += i
        }
    } else if (num1 > num2) {
        for (i in num2..num1) {
            sum += i
        }
    }
    println(sum)
}