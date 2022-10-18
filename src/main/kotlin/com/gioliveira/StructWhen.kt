package com.gioliveira


fun main(){
    println(OtherWhen("we"))
    println(OtherWhen("hello"))
    println(OtherWhen(12))
    MoreWhen()
}

fun StructWhen(){

    val condition = 1
    when(condition){
        5 -> println("condition == 5")
        8, 10 -> {
            println("condition is 8 or 10")
            println("other commands")
        }
        in 11..15 -> println("condition in range 11 and 15")
        !in 16..20 -> println("condition not in range 11 and 15")
        else -> println("This condition not mapered == 10")

    }
}

fun OtherWhen(condition:Any):Boolean{
    return when(condition){
        is String -> condition.startsWith("hello")
        else -> false
    }
}

fun MoreWhen() {
    when{
        OtherWhen(12) -> println("'m Twelve")
        OtherWhen("hello, i fine") -> println("Yes, perfect!")
    }
}
