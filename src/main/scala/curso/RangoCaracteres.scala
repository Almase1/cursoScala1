package curso

object RangoCaracteres extends App{
  import scala.util.Random
  val caracter: Char = Random.nextPrintableChar()
  //println(caracter)
  val rango = ' ' to caracter
  rango.foreach(println)  // rango.foreach(letra => println(letra))
  //Otra forma
  for(letra <- rango) println(letra)
}
