package com.gioliveira

fun main() {
    var person: Person2? = Person2("Giorgy", 35)
    println(person?.name)
    person=null
    //println(person!!.name)
}

data class Person2(var name: String, var age: Int) {}
