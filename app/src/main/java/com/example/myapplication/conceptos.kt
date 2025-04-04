package com.example.myapplication

fun main() {

//    println(saludar(name = "Pedro"))
//    println(saludar(name = "Juan"))
//    println(saludar(name = "Cesar"))

//    val operacion = obtenerOperacion(tipo = "multiplicacion")
//    val resultado = operacion(5,3)
//    println(resultado)

//    val cuadrado: (Int) -> Int = {num -> num * num}
//    println(cuadrado(16))

//    val numeros = listOf(1,2,3,4,5)
//    val numerosPrimos = listOf( 2, 3, 5, 7, 11)
//    println(numeros.sumarElementos())
//    println(numerosPrimos.sumarElementos())

//    numeros.forEach{
//        println(it*2)
//    }

//    val juan = Persona(nombre = "Juan")
//    juan.saludar()

//    val ejemplo = Ejemplo()
//    ejemplo.mensaje()

    val numeros = listOf(1,2,3,4,5)
    val cuadrados = numeros.map { it + it }
    val pares= numeros.filter { it % 2 == 0}
    val sumaTotal = numeros.reduce {acc, i -> acc +i}
    val numerosmutable = mutableListOf(1,2,3,4,5)

    println(numerosmutable)
    numerosmutable.add(20)
    println(numerosmutable)

    println("Cuadrados: $cuadrados" )
    println("Pares: $pares")
    println("suamaTotal: $sumaTotal")

}

fun tiposDeDatos(){

    /*
* Tipos de datos
* */

    // Numericos
    val bytExample: Byte = 127;
    val shortExample1: Short = 32767;
    var intExample1: Int = 2147483647;
    val longExample1: Long = 2147483648;

    // Decilmales
    val floatExample1: Float = 3.141592f;
    val doubleExample1: Double = 3.141592633589793;

    // Strings
    val charExample1: Char = 'a';
    val stringExample: String = "Esto es una cadena de texto "

    // Boolean
    val verdadero : Boolean = true;
    val falso : Boolean = false ;

    /*
    *println(longExample1)
    *intExample1 = 2147483
    *print(intExample1);
    * */

}

fun tipoDeOperadores(){

    /*
    *  Tipos de Operadores
    *  - Aritmeticos (+,-,*,/,%)
    *  - Logicos (||,&&)
    *  - Relacionales (<,>,==,===,<=,>=,!=)
    * */

    var num1: Int = 40;
    var num2: Int = 20;
    var num3: Int = 50;

    var suma: Int = num1 + num2;
    var resta: Int = num1 -num2;
    var multiplicacion: Int = num1 * num2;
    var divicion: Double = num1.toDouble() / num2.toDouble();

    var string1: String = "El resultado ";
    var string2: String = "de la opreracion es: "

    /*
    * println( "$suma, $resta, $multiplicacion, $divicion" )
    * */

    // ¿numero1 es menor que numero 2?
    /*
    if ((num1 < num2) && (num1 > num3)) {
        println("El numero $num1 es menor que $num2 pero mayor que $num3");
    } else {
        println("El numero $num1 es mayor que $num2 o menor que $num3");
    }
    */

    if (num1< num2) {
        println("El numero $num1 es menor que $num2");
    } else if (num1 > num3) {
        println("El numero $num1 es mayor que $num3")
    } else {
        println("Ninguna de las 2 condiciones se cumplieron")
    }

    val  diaDeLaSemana: String = "Domingo";

    when (diaDeLaSemana) {
        "Lunes" -> println("El dia de la semana es: Lunes")
        "Martes" -> println("El dia de la semana es: Martes")
        "Miercoles" -> println("El dia de la semana es: Miercoles")
        "Jueves" -> println("El dia de la semana es: Jueves")
        "Vieres" -> println("El dia de la semana es: Viernes")
        "Sabado" -> println("El dia de la semana es: Sabado")
        else -> println("El dia de la semana es: Domingo")
    }

}

fun saludar(name: String): String {
    return "hola $name, benvienidos a kotlin"
}

fun suma(numA: Int, numB: Int): Int{
    return numA + numB
}

fun resta(numA: Int, numB: Int) = numA - numB

fun operar(numA: Int, numB: Int, operacion: (Int,Int) -> Int): Int{
    return operacion(numA,numB)
}

fun obtenerOperacion(tipo: String): (Int, Int) -> Int{
    return when (tipo){
        "suma" -> {x,y -> x+y}
        "resta" -> {x,y -> x-y}
        "multiplicacion" -> {x,y -> x*y}
        "division" -> {x,y -> x/y}
        else -> {_,_->0}
    }
}

fun String.reversa(): String {
    return this.reversed()
}

/*fun Persona.saludar(){
    println("Hola, mi nombre es $nombre")
}*/

fun List<Int>.sumarElementos(): Int{
    return this.sum()
}

/*Clases*/
//class Persona(val nombre: String)

class Ejemplo {
    public fun mensaje(){
        println("esto es un mensaje")
    }
}