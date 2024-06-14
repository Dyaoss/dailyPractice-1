fun main() {
    println("영어 단어를 입력해주세요")
    var word = readLine()!!
    var char: CharArray = word.toCharArray()
    var count = 0

    for(i in 0..(word.length-1)){
        if('a' == char[i]){
            count++
        }
    }

    println(count)

}