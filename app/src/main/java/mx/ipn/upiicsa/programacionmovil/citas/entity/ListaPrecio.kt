package mx.ipn.upiicsa.programacionmovil.citas.entity

class ListaPrecio(var id: Int, var nombre: String) {
    var inicio: Long = 0
    var fin: Long = 0


    constructor(id: Int, nombre: String, inicio: Long, fin: Long) : this(id, nombre) {
        this.inicio = inicio
        this.fin = fin
    }
}