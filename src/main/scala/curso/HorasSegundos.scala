package curso

object HorasSegundos {

  def main(args: Array[String]): Unit = {
    print("Valor1: ")
    var valor1 = scala.io.StdIn.readInt()
    print("Valor2: ")
    var valor2 = scala.io.StdIn.readInt()

    println(calculaSegundos(valor1, valor2))
  }

  def calculaSegundos(horas: Int, segundos: Int): Int = {
    val tiempo = 0
    tiempo + horas * 3600 + segundos * 60
  }


}
