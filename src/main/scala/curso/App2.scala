package curso

object App2 extends App{
  import scala.util.Random
  val numero: Int = Random.nextInt(10)
  val x: Int = Random.nextInt(10)
  //println(numero)
  numero match {
    case 0 => println("cero")
    case numero if (numero == 1 ) => println("Uno")
    case 2  => println("dos")
    case numero if (numero >= 4 && numero <= 6 ) => println("Entre 4 y 6")
    case _  => println("Otros muchos")
  }

}
