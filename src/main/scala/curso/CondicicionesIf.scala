package curso

object CondicicionesIf extends App {

  //Pedir 3 números por teclado e indicar el mayor
  print("introduce un numero1: ")
  var n1 = scala.io.StdIn.readInt
  print("introduce un numero2: ")
  var n2 = scala.io.StdIn.readInt
  print("introduce un numero3: ")
  var n3 = scala.io.StdIn.readInt
  if (n1 > n2 && n1 > n3) {
    println("El mayor es: " + n1)
  }
  if (n2 > n1 && n2 > n3) {
    println("El mayor es: " + n2)
  }
  if (n3 >= n1 && n3 >= n2) {
    println("El mayor es: " + n3)
  }
  //Pedir 2 números por pantalla del a al 100 e indicar cual es más cercano a 100
  import scala.util.Random

  val numero1: Int = Random.nextInt(100)
  val numero2: Int = Random.nextInt(100)
  //println(numero)
  numero1 match {
    case numero1 if (100-numero1 < 100-numero2) => println(numero1 + " mas cercano a 100")
    case numero1 if (100-numero1 > 100-numero2) => println(numero2 + " mas cercano a 100")
    case numero1 if (100-numero1 == 100-numero2) => println(numero1 + " y " + numero2 + "están igual de cerca")
    case _ => println("Error")

  }


}

