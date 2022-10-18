package com.gioliveira

data class Person(val name: String, var age: Int, var car: Car){
}

data class Car(var name:String, var yerarFactory:Int){}
fun main(){
    var person: Person = Person("", 35, Car("mustang", 1968));
    println(person);
    person.age=36;
    println(person)
    println(person.car.name);
    person.car.name="ferrary";
    person.car.yerarFactory=1890;
    println(person.car.name);
    println(person)

}
