package curso

object Sumar extends App{

  print("Valor1: ")
  var valor1 = scala.io.StdIn.readInt()
  print("Valor2: ")
  var valor2 = scala.io.StdIn.readInt()
  println("Resultado: " + sumar(valor1, valor2))


  def sumar(v1: Int , v2: Int): Int = {
  {
    var resultado = v1 + v2
    resultado
  }

  }
}
