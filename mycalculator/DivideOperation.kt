package com.example.mycalculator


class DivideOperation {
    fun operate(num1: Double, num2: Double) {
        if (num2 != 0.0) {
            val result = num1 / num2
            println("결과 값: $result")
        }else{
            println("분모를 0으로 나누시려고 하는군요!")
            println("숫자를 다시 입력하세요")
            var renum = readln().toDouble()
            return operate(num1,renum)
        }
    }
}

