package mx.ipn.upiicsa.programacionmovil.citas.entity

class Sucursal(var id: Int, var idEstablecimiento: Int) {
    var nombre: String = ""
    var ubicacion: String = ""


    constructor(id: Int, idEstablecimiento: Int, nombre: String, ubicacion: String) : this(id, idEstablecimiento) {
        this.nombre = nombre
        this.ubicacion = ubicacion
    }
}