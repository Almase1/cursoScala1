

object App1 extends App{

  import scala.util.Random
  val x =Random.nextInt(10)

  x match {

    case 0 => println("cero")
    case 1 => println("uno")
    case 2 => println("dos")

    case _ => println(x+" muchos")
  }

}
