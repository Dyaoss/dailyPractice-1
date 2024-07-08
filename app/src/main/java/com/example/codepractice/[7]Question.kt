package com.example.codepractice

fun main() {
//    [7] 날짜를 입력하여 해당 요일이 무슨요일 인지를 판별하기 (달의 기준은 30일이며 1일은 월요일입니다.)
    //    입력 2일, 출력:화요일입니다.

    println("날짜를 입력해주세요. (날짜는 30일까지 있습니다./ 종료하려면 0을 눌러주세요)")
    val day = readLine()!!.toInt()

    if (day == 0) {
        print("종료")
    } else if (day in 1..30) {
        val any = when (day % 7) {
            1 -> println("월요일입니다.")
            2 -> println("화요일입니다.")
            3 -> println("수요일입니다.")
            4 -> println("목요일입니다.")
            5 -> println("금요일입니다.")
            6 -> println("토요일입니다.")
            else -> println("일요일입니다.")
        }
    } else if (day > 30) {
        println("30이하의 수를 입력해주세요")
    }
}
