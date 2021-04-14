package curso

object NumerosPares extends App{
  //Imprimnir numeros pares del 1 al 100
  val rango1 = 1 to 100

  for (x <- rango1) {if(x%2 == 0) {println(x)}}

  //Otra forma de hacerlo
  val rango2 = 2 to 100 by 2

  for (x <- rango2) {println(x)}


}
