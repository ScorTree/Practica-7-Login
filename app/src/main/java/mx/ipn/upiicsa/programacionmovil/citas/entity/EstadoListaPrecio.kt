package mx.ipn.upiicsa.programacionmovil.citas.entity

class EstadoListaPrecio(var id: Int, var nombre: String) {
    var activo: Boolean = false

    constructor(id: Int, nombre: String, activo: Boolean) : this(id, nombre) {
        this.activo = activo
    }
}
