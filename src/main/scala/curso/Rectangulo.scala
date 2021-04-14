package curso

object Rectangulo {

  def main(args: Array[String]): Unit = {
    println("Introduce el primer lado")
    var lado1 = scala.io.StdIn.readInt()
    println("Introduce el primer lado")
    var lado2 = scala.io.StdIn.readInt()
    println("Introduce el carácter")
    var caracter = scala.io.StdIn.readChar()

    //10rectangulo(caracter,lado1,lado2)
    rectangulo(lado1=10,lado2=10)
  }

  def rectangulo(caracter:Char='*',lado1:Int,lado2:Int): Unit =
  {
    for(l1<-1 to lado1) {
      {
        for(l2<-1 to lado2) {
          print(caracter)
        }
      }
      println()
    }
  }




}
