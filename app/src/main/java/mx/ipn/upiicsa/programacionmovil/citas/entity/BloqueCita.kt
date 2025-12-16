package mx.ipn.upiicsa.programacionmovil.citas.entity

class BloqueCita(var id: Int, var idHorario: Int) {
    var inicio: Long = 0
    var fin: Long = 0


    constructor(id: Int, idHorario: Int, inicio: Long, fin: Long) : this(id, idHorario) {
        this.inicio = inicio
        this.fin = fin
    }
}