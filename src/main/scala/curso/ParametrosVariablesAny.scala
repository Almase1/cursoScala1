package curso

object ParametrosVariablesAny extends App {
  //print("introduce un array tipo ANY: ")
  //var l = scala.io.StdIn.readLine()
  var l = (2, "HOLA")
  var l1 = ' '
  var l3 = 2.2
  var l4 = "HELLO"
  tipo(l, l1, l3, l4)

  def tipo(a: Any*): Unit = {
    //Con foreach
    a.foreach(x => println(x.getClass.getSimpleName))

    //Con bucle normal
   /*
    for (x <- a) {
      println(x.getClass.getSimpleName)
    }*/
  }
}
