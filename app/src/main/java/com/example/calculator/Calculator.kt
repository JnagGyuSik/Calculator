package com.example.calculator

fun main(){
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

fun addOperation(num1:Int, num2: Int){
    var result = num1 + num2
    println("$num1 + $num2 = $result")
}

fun substractOperation(num1:Int, num2: Int){
    var result = num1 - num2
    println("$num1 - $num2 = $result")
}

fun multiplyOperation(num1:Int, num2: Int){
    var result = num1 * num2
    println("$num1 * $num2 = $result")
}

fun divideOperation(num1:Int, num2: Int){
    var result = num1 / num2
    println("$num1 / $num2 = $result")
}