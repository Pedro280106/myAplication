package com.example.myapplication

fun main(){

//    val pedro = Persona(nombre= "Pedro",19)
//    val juan = Persona(nombre= "juan",20)
//    val cesar = Persona(nombre= "Cesar",25)

//    val cuenta = CuentaPremiun(200.00)
//    cuenta.depositar(40.00)
//    cuenta.aplicarIntereses(0.1)
//    println("saldo en cuenta premiun: ${cuenta.verSaldo()}")

    val miAnimal = Animal()
    val miPerro = Perro()
    val miGato = Gato()

    miAnimal.sonido()
    miAnimal.caminar()
    miPerro.sonido()
    miPerro.caminar()
    miGato.sonido()
    miGato.caminar()


}

fun bucleFor(numeros: List<Int>){
    for (numero in numeros){
        if (numero % 2 !=0){
            println(numero)
        }else{
            continue
        }
    }
}

fun bucleWhile(){
    var contador = 5
    while (contador > 0){
        println("Cuenta atas: $contador")
        contador--
    }
}

class Persona(var nombre: String, var edad: Int){

    init {
        println("${this.nombre} ha sido registrado con ${this.edad} anios")
    }

    fun saludar(){
        println("Hola soy ${this.nombre} y tengo ${this.edad} anios")
    }
}

open class CuentaBancaria(protected var saldo: Double){
    fun depositar(monto: Double){
        saldo += monto
    }

    fun verSaldo() = println(saldo)

}
class CuentaPremiun(saldo: Double): CuentaBancaria(saldo){
    fun aplicarIntereses(tasa: Double){
        saldo += saldo * tasa
    }
}

open class Animal{
    open fun sonido(){
        println("haciendo un sonido")
    }

    open fun caminar(){
        println("Avenza hacia adelante")
    }
}

class Perro: Animal(){
    override fun sonido() {
        println("guau guau")
    }
}

class Gato: Animal(){
    override fun sonido(){
        println("miau miau")
    }
}