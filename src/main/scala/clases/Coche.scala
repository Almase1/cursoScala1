package clases

class Coche {

  var bastidor: String=_
  var cv:Int=0
  var matricula:String=_
  var pvp:Double=_
  var descripcion:String=_


  def alta_datos(b:String,cv:Int,ma:String,p:Double,d:String): Unit = {

    this.bastidor=b
    this.cv=cv
    this.matricula=ma
    this.pvp=p
    this.descripcion=d
  }

  def visualizar():Unit= {
    println(bastidor+" "+cv+" "+matricula+" "+pvp+" "+this.descripcion)
  }


  /*
  Propiedades
      bastidor String
      cv Int
      matricula String
      pvp Double
      descripcion String

   Metodos
      alta_datos(bastidors, cv.....)
      visualizar()


      Probar luego en el object Principal
   */



}
