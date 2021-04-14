package curso

//Funcion para devolver los valores mayor y meno  de una lista en forma de List
object Lista2 extends App {


  var l1: List[Int] = List(10, 20, 30)
  println(mayor_menor(l1))

  def mayor_menor(l: List[Int]): List[Int] = {
    var l2: List[Int] = List()

    l2 = l2 :+ l.max
    l2 = l2 :+ l.min
    l2


  }
}