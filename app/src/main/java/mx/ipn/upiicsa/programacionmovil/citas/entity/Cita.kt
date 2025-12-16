package mx.ipn.upiicsa.programacionmovil.citas.entity

class Cita(var id: Int, var idCliente: Int) {
    var idSucursal: Int = 0
    var idEmpleado: Int = 0
    var fecha: Long = 0
    var inicio: Long = 0
    var fin: Long = 0
    var idEstado: Int = 0


    constructor(id: Int, idCliente: Int, idSucursal: Int, idEmpleado: Int, fecha: Long, inicio: Long, fin: Long, idEstado: Int) : this(id, idCliente) {
        this.idSucursal = idSucursal
        this.idEmpleado = idEmpleado
        this.fecha = fecha
        this.inicio = inicio
        this.fin = fin
        this.idEstado = idEstado
    }
}