package com.example.calculator

fun main(){
    val loop = true

    //첫 계산이 끝나도 프로그램이 종료되지 않고 다시 처음부터 실행
    while (loop){
        //처음에 인트형으로 지정하고 문자열을 입력받으면 에러가남. 해결을 위해서 문자열로 지정
        var num1 = readLine()!!.toString()
        var calculation = readLine()!!.toString()
        var num2 = readLine()!!.toString()

        //예외처리
        try {
            var num3 = num1.toInt()
            var num4 = num2.toInt()

            when (calculation) {
                "+" -> addOperation(num3, num4)
                "-" -> substractOperation(num3, num4)
                "*" -> multiplyOperation(num3, num4)
                "/" -> divideOperation(num3, num4)
                else -> println("연산자 *, -, *, / 중에 입력해주세요")
            }
        }catch (e: NumberFormatException){ //에러 NumberFormatException가 날 경우 println출력
            println("숫자를 입력해 주세요")
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
    var result = num1.toDouble() / num2.toDouble()
    println("$num1 / $num2 = $result")
}