package curso

object CaracterEnCadena extends App{
  var cadena = scala.io.StdIn.readLine("Cadena: ")
  print("Caracter: ")
  var caracter = scala.io.StdIn.readChar()
  var c_in_cadena = false
  var posicion:Int=0
  var x=0
  for (letra <- cadena) {
    if (letra == caracter) {
      c_in_cadena = true
      x=posicion
    }
    posicion=posicion+1
  }
  if (c_in_cadena == true) {
    println("Caracter existe dentro de cadena y se encuentra en la posicion:"+x)
  } else println("Caracter NO existe dentro de cadena")

}
