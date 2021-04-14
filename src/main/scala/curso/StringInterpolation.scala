package curso

object StringInterpolation extends App {
  print("introduce el nombre de un producto: ")
  var a = scala.io.StdIn.readLine
  print("introduce su precio de venta: ")
  var b = scala.io.StdIn.readFloat
  println(f"El precio inicial de $a es de $b%.2f y después del IVA es ${b * 1.21}%.2f")

}
