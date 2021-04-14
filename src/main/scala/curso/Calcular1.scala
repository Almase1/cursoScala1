package curso

object Calcular1 extends App {

  def operar(x: Float, y: Float=1,op: Char): Float = {
    op match {
      case '+' => x + y
      case '*' => x * y
      case '-' => x - y
      case '/' => x / y
      case _ => 0
    }
  }

  println("num 1:")
  var num1 = scala.io.StdIn.readFloat()

  println("num 2:")
  var num2 = scala.io.StdIn.readFloat()

  println("oper:")
  var operador = scala.io.StdIn.readChar()

  println(operar(num1, num2, operador))

}
