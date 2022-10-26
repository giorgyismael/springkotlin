package com.gioliveira

fun main() {

    //Por padrão kotlin cuida para que não aconteça NullPointerException
    //O ponto de ? indica que a variavel pode ser nula, ou não.
    var name:String? = null;
    var nameTwo:String = "foo";

    //Variavel nativamente descrita como nullsafety dispensa verificação abaixo.
    if(nameTwo != null){}


    println(nameTwo.length);

    //O ponto de ? garante que a variavel seja nula, o retorno de uma chamada de método será nulo
    //E não ocorrerá lançamento de exception.
    if (name != null) {
        println(name.length)
    };

    //O ponto de ? antes de chamar um outros níveis do objeto,
    // garante que se for nulo, o retorno é nulo e não terá problemas
    println(name?.length);
    println(name?.length?.toShort());

    // Já o ponto de !! ignora as verificações nativas do kotlin e confia nos acessos
    //E caso seja nulo, será lançada exception
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
