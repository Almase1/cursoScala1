package curso

object ParametrosVariables extends App{

  enteros(10,20,45,12)


  def enteros(numeros:Int*): Unit =
  {
    println("El numero total es:"+numeros.length)

    var mayor=0
    //Con un foreach
    numeros.foreach( x => {if (x>mayor) mayor=x }   )

    //Con un bucle tradicional
    /*
    for(n <- numeros)
      {
        if (n > mayor) mayor=n
      }*/
    println("El mayor es:"+mayor)
  }

}
