package mx.ipn.upiicsa.programacionmovil.citas.entity

class Servicio(var id: Int, var nombre: String) {
    var descripcion: String = ""
    var duracion: Int = 0


    constructor(id: Int, nombre: String, descripcion: String, duracion: Int) : this(id, nombre) {
        this.descripcion = descripcion
        this.duracion = duracion
    }
}