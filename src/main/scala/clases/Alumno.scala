package clases

class Alumno  {

  var nombre:String=_

  var edad: Int = 29

  var apellidos:String=_

  def nombre_completo(): String = {

      nombre + " " + apellidos
    }

    def ver_edad(): Int = {
      edad
    }

}