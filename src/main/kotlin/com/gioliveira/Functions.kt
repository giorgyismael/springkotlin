package com.gioliveira

fun main():Unit {
    println("foo");
    var name = returnname();
    val greeting:String = hello2("Giorgy",35);
    hello(age = 35, name="Giorgy");
    hello();
    println(hello2("Giorgy",35))
}

fun returnname():String{
    return "Giorgy";
}

fun hello(name:String="foo"):Unit{
    println("hello, ${name}");
}
fun hello(name:String, age:Int):Unit{
    println("hello, ${name}, congractulations on ${age} ");
}
fun hello2(name:String, age:Int): String {
    return ("hello, ${name}, congractulations on ${age}");
}

fun printgreeting(greeting:String){
    print(greeting);
}
