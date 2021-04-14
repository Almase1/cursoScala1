package curso

object ParametrosVariables extends App{

  enteros(10,20,45,12)


  def enteros(numeros:Int*): Unit =
  {
    println("El numero total es:"+numeros.length)

  }

}
