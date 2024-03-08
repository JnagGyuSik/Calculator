package com.example.calculator

open class Calculator(){
    //예외처리
    open fun calculator(num1: String, calculation:String, num2: String){
        try {
            val num3 = num1.toDouble()
            val num4 = num2.toDouble()
            when (calculation) {
                "+" -> AddOperation(num3,num4).operate()
                "-" -> SubstractOperation(num3,num4).operate()
                "*" -> MultiplyOperation(num3,num4).operate()
                "/" -> DivideOperation(num3,num4).operate()
                else -> println("연산자 *, -, *, / 중에 입력해주세요")
            }
        }catch (e: NumberFormatException){ //에러 NumberFormatException가 날 경우 println출력
            println("숫자를 입력해 주세요")
        }
    }
}

//추상화 클래스
abstract class Operation{
    abstract fun operate()
}

class AddOperation(val num1:Double, val num2: Double):Operation(){
    //구현체
    override fun operate() {
        //더하기
        val result = num1 + num2
        println("$num1 + $num2 = $result")
    }
}


class SubstractOperation(val num1:Double, val num2: Double) : Operation(){
    override fun operate() {
        //빼기
        val result = num1 - num2
        println("$num1 - $num2 = $result")
    }
}

class MultiplyOperation(val num1:Double, val num2: Double) : Operation(){
    override fun operate() {
        //곱하기
        val result = num1 * num2
        println("$num1 * $num2 = $result")
    }
}

class DivideOperation(val num1:Double, val num2: Double) : Operation(){
    override fun operate() {
        //나누기
        val result = num1 / num2
        println("$num1 / $num2 = $result")
    }
}


fun main(){
    val loop = true
    //첫 계산이 끝나도 프로그램이 종료되지 않고 다시 처음부터 실행
    while (loop){
        //처음에 인트형으로 지정하고 문자열을 입력받으면 에러가남. 해결을 위해서 문자열로 지정
        val num1 = readLine()!!.toString()
        val calculation = readLine()!!.toString()
        val num2 = readLine()!!.toString()

        val myCalculator = Calculator()
        myCalculator.calculator(num1,calculation,num2)
    }
}