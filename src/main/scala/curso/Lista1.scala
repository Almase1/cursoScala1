package curso


//Funcion para devolver el mayor valor de una lista
object Lista1 extends App {


   var l1: List[Int]  = List(10,20,30)
    println(mayor(l1))

  def mayor(l: List[Int]): Int={
       l.max
  }


}
