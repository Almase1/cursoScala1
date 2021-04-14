package clases

object Principal {

  def main(args: Array[String]): Unit = {
    //Crear un alumno

    var alumno1=new Alumno()
      alumno1.apellidos="Perez"
     println(alumno1.ver_edad())
     println(alumno1.nombre_completo())

    //Crear un coche
     var coche1=new Coche
    coche1.alta_datos("mmm",110,"matricula1",100,"descripcion")
    coche1.visualizar()

  }
}
