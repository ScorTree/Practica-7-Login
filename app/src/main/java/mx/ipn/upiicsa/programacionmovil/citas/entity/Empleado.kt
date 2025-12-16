package mx.ipn.upiicsa.programacionmovil.citas.entity

class Empleado(var id: Int, var idSucursal: Int) {
    var idPersona: Int = 0
    var idRol: Int = 0


    constructor(id: Int, idSucursal: Int, idPersona: Int, idRol: Int) : this(id, idSucursal) {
        this.idPersona = idPersona
        this.idRol = idRol
    }
}