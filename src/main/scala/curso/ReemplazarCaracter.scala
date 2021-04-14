package curso

object ReemplazarCaracter extends App {

  //Una forma
 /* var cadena = scala.io.StdIn.readLine("Introduce una cadena de caracteres: ")
  println("Introducir caracter a reeplazar")
  var car1 = scala.io.StdIn.readChar()
  println("Introducir caracter por el que lo sustituimos")
  var car2 = scala.io.StdIn.readChar()
  var pos: Int = 0
  for (x <- cadena) {
    if (x == car1) {
      cadena = cadena.substring(0, pos) + car2 + cadena.substring(pos + 1, cadena.length)

    }
    pos = pos + 1
  }
  println(cadena)*/
 //Otro ejemplo
  var cadena = scala.io.StdIn.readLine()
  var caracter1 = scala.io.StdIn.readChar()
  var caracter2 = scala.io.StdIn.readChar()
  var longitud = cadena.length
  for (p <- 0 to longitud - 1) {
    if (cadena(p) != caracter1) {
      print(cadena(p))
    }else
      print(caracter2)
  }

}
