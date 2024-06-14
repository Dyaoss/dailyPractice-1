//[5] 1-100의 숫자 중에  2개를 뽑아 더하거나, 곱하거나, 나눠서 25가 나오는 경우의 수와 몇 번인지 구하기
// 출력 예) (1,24), (2,23), (5,5),,,,   총 30개.

package com.example.codepractice

fun main() {
    var count = 0

    for (i in 1..100) {
        for (j in 1..100) {
            if (i + j == 25) {
                println("($i,$j)")
                count++
            }
            if (i * j == 25) {
                println("($i,$j)")
                count++
            }
            if (i.toDouble() / j.toDouble() == 25.0) {
                println("($i,$j)")
                count++
            }
            if (j.toDouble() / i.toDouble() == 25.0) {
                println("($i,$j)")
                count++
            }
        }
    }

    print(count)
}