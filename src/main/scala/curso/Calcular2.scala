package curso

object Calcular2 extends App{


  println(calcular('*',1,4,56,34))

  def calcular (op: Char, numeros: Float*): Float={

    var t: Float=0

    if (op=='+' || op=='-') t=0 else t=1

  op match {
    case '+' => { numeros.foreach(x=>t=t+x) ; t}
    case '-' => { numeros.foreach(x=>t=t-x)
                   t}
    case '*' => { numeros.foreach(x=>t=t*x)
                   t}
    case '/' => { numeros.foreach(x=>t=t/x)
              t }
    case _ => 0
  }
}

}
