package com.gioliveira

fun main() {
    printRangeUpTo();
    printRangeDownTo()
}
fun printRangeUpTo(){
    for(number in 1..10){
        println(number)
    }
}
fun printRangeDownTo(){
    for(number in 10 downTo 1){
        println(number)
    }
}

fun printRangeUpToAndStepTwo(){
    for(number in 2 ..10 step 2){
        println(number)
    }
}


fun StructWhile(){
    var index =0;
    while (index < 10){
        println(index)
        index++
    }
}fun StrictDoWhile(){
    var index=10
    do{
        println(index)
        index--
    } while (index > 1)
}



