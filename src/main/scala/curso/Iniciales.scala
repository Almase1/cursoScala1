package curso

object Iniciales {
  def main(args: Array[String]): Unit = {
    var nombre = scala.io.StdIn.readLine("Introduce el nombre")
    var ape1 = scala.io.StdIn.readLine("Introduzca el apellido1")
    var ape2 = scala.io.StdIn.readLine("Introduzca el apellido2")

    println(iniciales(nombre, ape1, ape2))
  }

  def iniciales(nom: String, apl1: String, apl2: String): String = {
    nom.substring(0, 1).toUpperCase + "." + apl1.substring(0, 1).toUpperCase + "." + apl2.substring(0, 1).toUpperCase + "."
  }


}
