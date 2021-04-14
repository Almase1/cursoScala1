package curso

object App3 extends App {
  var cadena1 = scala.io.StdIn.readLine("Cadena 1:")
  println("Introduce un caracter:")
  var caracter = scala.io.StdIn.readChar()
  var x = 0

  while (x < cadena1.length) {
    {
      if (cadena1(x).toUpper == caracter.toUpper) {
        println("Encontrado en la posición:" + x)
      }
      x = x + 1
    }

  }
}