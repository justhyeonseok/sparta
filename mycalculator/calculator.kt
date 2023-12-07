package com.example.mycalculator

fun main(){
    println("숫자를 입력하세요")
    var mynum1 = readln().toDouble()
    println("숫자를 입력하세요")
    var mynum2 = readln().toDouble()
    println("연산자를 입력하세요(+,-,*,/,%)")

    var operator = readLine()


    val addOperation = AddOperation()
    val substractOperation = SubstractOperation()
    val multiplyOperation = MultiplyOperation()
    val divideOperation = DivideOperation()

    val remainder = mynum1 % mynum2

    when (operator) {
        "+" -> addOperation.operate(mynum1,mynum2)
        "-" -> substractOperation.operate(mynum1,mynum2)
        "*" -> multiplyOperation.operate(mynum1,mynum2)
        "/" -> divideOperation.operate(mynum1,mynum2)
        "%" -> println("결과 값: $remainder")
    }
}