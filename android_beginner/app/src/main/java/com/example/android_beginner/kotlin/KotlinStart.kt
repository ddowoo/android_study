package com.example.android_beginner.kotlin

// java의 final 같은 느낌
// java는 무조건 클래스 내에 선언
val topCon = "topCon"

fun main() {
    print("Hello World")
    // 타입 추론 가능
    var print = "Hello World"
    //  타입 명시
    var i:Int = 10
    print(print)


    // 상수 재선언 불가ㄴ
    val con = "Hello World"

    // 형변환 => to~~
    var idx = 10
    var l = 10L

    l = idx.toLong()
    idx = l.toInt()

    //String
    var name = "DDOWOO"
    print(name)
    print(name.toUpperCase())
    print(name[1])
    print("제 이름은" + name)
    print("제 이름은 $name")
    print("제 이름은 ${name}") // 수식이 필요한 경우
}