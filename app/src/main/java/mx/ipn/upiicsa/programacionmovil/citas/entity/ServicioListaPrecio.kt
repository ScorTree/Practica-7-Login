package mx.ipn.upiicsa.programacionmovil.citas.entity

class ServicioListaPrecio(var id: Int, var idServicio: Int) {
    var idListaPrecio: Int = 0
    var precio: Int = 0


    constructor(id: Int, idServicio: Int, idListaPrecio: Int, precio: Int) : this(id, idServicio) {
        this.idListaPrecio = idListaPrecio
        this.precio = precio
    }
}