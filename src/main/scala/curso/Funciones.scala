package curso

object Funciones extends App {

  println(f1())
  f2()
  println(f3("alberto"))


  def f1(): String = {
    var x = 1
    if (x == 1) {
      "adios"
    } else {
      "hola"
    }
  }
  //Procedimiento
  def f2():Unit=
    {
      println("Esto es una prueba")
    }

  def f3(nombre: String): String= {
    nombre.toUpperCase
  }


}
