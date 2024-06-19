package com.example.codepractice

//[6] 월을 입력받아 해당 월이 어떤 계절에 속하는지를 판별하기
// (계절의 기준은 3월~5월까지 봄입니다., 6~8월:여름..    입력: 4, 출력:봄입니다.)
fun main() {
    var month = readLine()!!.toInt()

    if (month in 3..5) {
        println("${month}월은 봄입니다.")
    } else if (month in 6..8) {
        println("${month}월은 여름입니다.")
    } else if (month in 9..11) {
        println("${month}월은 가을입니다.")
    } else println("${month}월은 겨울입니다.")
}