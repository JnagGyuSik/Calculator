package com.example.calculator
var result:Int = 0
fun main(){
    val loop = true

    while (loop){
        //숫자와 연산자를 입력받음
        var num1 = readLine()!!.toInt()
        var calculation = readLine()!!.toString()
        var num2 = readLine()!!.toInt()

        when (calculation){
            "+" ->  addOperation(num1,num2)
            "-" ->  substractOperation(num1,num2)
            "*" ->  multiplyOperation(num1,num2)
            "/" ->  divideOperation(num1,num2)
            else -> println("*, -, *, / 중에 입력해주세요")
        }
    }
}

//더하기
fun addOperation(num1:Int, num2: Int){
    var result = num1 + num2
    println("$num1 + $num2 = $result")
}

//빼기
fun substractOperation(num1:Int, num2: Int){
    var result = num1 - num2
    println("$num1 - $num2 = $result")
}

//곱하기
fun multiplyOperation(num1:Int, num2: Int){
    var result = num1 * num2
    println("$num1 * $num2 = $result")
}

//나누기
fun divideOperation(num1:Int, num2: Int){
    var result = num1 / num2
    println("$num1 / $num2 = $result")
}