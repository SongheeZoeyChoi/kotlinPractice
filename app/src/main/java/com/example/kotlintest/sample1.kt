package com.example.kotlintest

import kotlin.concurrent.thread

fun main() {
    helloWorld()
    println(add(4,2))

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

    // 6. for
    forAndWhile()

    // 7. Nullable / NonNull
    nullCheck()
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
// Expression //
// - 값을 만들어내면 Expression
// - 코틀린의 모든 함수는 Expression : 아무리 리턴값이 없더라도 Unit을 리턴하기 때문에 Expression 이라 함.

// Statement //
// - 무엇을 만들어내라~~~ 명령하는 것. 단 값을 만들어내지는 않음


// 5. Array and List

// Array

// List
// 1. List : (수정 불가능) , 읽기 전용
// 2. MutableList : (수정가능), 일기 쓰기 모두 가능

fun array() {
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    val array2 = arrayOf(1, "d", 3.4f)
    val list2 = listOf(1, "d", 11L)

    array[0] = 3
//    list[0] = 2 // 이렇게 바꿀 수 는 없다
    var result = list.get(0) // 가져올수만 있음. set은 없다.

    // MutableList : 가장 대표적인 arrayList
    val arrayList = arrayListOf<Int>() // val 써도 상관 없음. 주소값은 바뀌지 않기 때문에
    arrayList.add(10)
    arrayList.add(20)
    arrayList[0] = 22

//    arrayList = arrayListOf<Int>()// 새로운 객체를 생성할 때는 val 사용할 수 없음
}



// 6. For / While

fun forAndWhile() {
    val students = arrayListOf("aaa", "bbb", "ccc", "ddd")

    for (name in students) {
        println("${name}")
    }

    // withIndex : index와 값을 같이 나타낼 수 있다. swift의 enumerate와 대응
    for ((index, name) in students.withIndex()) {
        println("${index+1}번째 학생: ${name}")
    }


    var sum = 0
    for ( i in 1..10 ) {
        sum += i
    }
    println("for in : ${sum}") //for in : 55

    // step : step 키워드를 사용하여 증감 간격 조정
    sum = 0
    for ( i in 1..10 step 2) {
        sum += i
    }
    println("for in step: ${sum}") // for in step: 25

    // downTo : 감소 범위
    sum = 0
    for ( i in 1 downTo -10) {
        sum += i
    }
    println("for in downTo: ${sum}") // for in downTo: -54

    // downTo step : 감소 범위
    sum = 0
    for ( i in 1 downTo -10  step 2) {
        sum += i
    }
    println("for in downTo step : ${sum}") // for in downTo step : -24

    // until : 특정 값의 전 까지
    sum = 0
    for ( i in 1 until 100) {  // 1~99 까지 ( 1..100 : 1~100까지 )
        sum += i
    }
    println("for in downTo step : ${sum}") // for in downTo step : -24


    // while //
    var index = 0
    while (index < 10 ) {
        println("current index: ${index}")
        index++
    }
}



// 7. Nullable / NonNull
fun nullCheck() {
    //NPE: Null Pointer Exception
    var name = "songhee" // NunNull

    var nullName: String? = null // Nullable

    var nameInUppercase = name.uppercase()

    var nullNameInUppercase = nullName?.uppercase() // swift 옵셔널과 대응


    // ?:   // swift ?? 디폴트값 선언과 대응 대신 ()소괄호 써줘야함.
    val lastName: String? = "Hong"

    val fullName = name + " " + (nullName ?: "NO LastName")

    var mLastName = lastName ?: throw IllegalArgumentException("No Last name")

    println(fullName)

}



