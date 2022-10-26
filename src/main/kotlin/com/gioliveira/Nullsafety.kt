package com.gioliveira

fun main() {

    //Por padr�o kotlin cuida para que n�o aconte�a NullPointerException
    //O ponto de ? indica que a variavel pode ser nula, ou n�o.
    var name:String? = null;
    var nameTwo:String = "foo";

    //Variavel nativamente descrita como nullsafety dispensa verifica��o abaixo.
    if(nameTwo != null){}


    println(nameTwo.length);

    //O ponto de ? garante que a variavel seja nula, o retorno de uma chamada de m�todo ser� nulo
    //E n�o ocorrer� lan�amento de exception.
    if (name != null) {
        println(name.length)
    };

    //O ponto de ? antes de chamar um outros n�veis do objeto,
    // garante que se for nulo, o retorno � nulo e n�o ter� problemas
    println(name?.length);
    println(name?.length?.toShort());

    // J� o ponto de !! ignora as verifica��es nativas do kotlin e confia nos acessos
    //E caso seja nulo, ser� lan�ada exception
    name="foo"
    val toShort: Short = name!!.length!!.toShort();


    //ElvisOperation ?:
    //Serve para deixar um fallback em caso de NullPointerException
    var nameThree:String? = null
    val length: Int = nameThree?.length ?: 0
   // var result: Int = nameThree?.length ?: throw NullPointerException()
    var OtherResult: Boolean = (nameThree?.length ?: false) as Boolean

    //Pode conter elementos nulos
    var listOne:List<Int?> = listOf(1,2,null, 4)

    //Pode ser nula
    var listTwo:List<Int>? = null

}
