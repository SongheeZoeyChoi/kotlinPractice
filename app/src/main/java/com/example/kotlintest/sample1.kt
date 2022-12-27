package com.example.kotlintest

fun main() {
//    helloWorld()
//    println(add(4,2))

    //3. String Template
    val name = "Song"
    val lastName = "Choi"
    println("my name is ${name + lastName}I'm 35 ") // 변수 출력 : $ or ${} 표시
    println("is this true? ${1==0}")
    println("this 2\$ 입니다.") // $표시를 문자로 사용하고 싶을 때


    //4. 조건식
    println(maxBy(3, 6))
    println(maxBy2(4,2))


    //5. when
    checkNum(1)
}

//4. 조건식
fun maxBy(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}
// 위와 동일
fun maxBy2(a: Int, b: Int) = if (a>b) a else b


// 5.when
fun checkNum(score: Int) {
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3")
    }

    var b = when(score) {
        1 -> 1
        2 -> 2
        else -> 3 // else를 꼭 써줘야함
    }

    println("b: ${b}")

    when(score){
        in 90..100 -> println("굿")
        in 10..80 -> println("낫굿")
        else -> println("soso")
    }
}


//1. 함수
fun helloWorld() {
    println("hello world")
}

fun add(a: Int, b: Int) : Int {
    return a+b
}


//2. val vs var
// val = value : 상수
// var = variance : 변수

fun hi() {
    val a: Int = 10
    var b: Int = 9
    b = 2

    // 자동 추론
    val c = 10
    var d = 7

    var name = "songhee"
}


// Expression vs Statement
