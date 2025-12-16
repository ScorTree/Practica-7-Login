package mx.ipn.upiicsa.programacionmovil.citas.entity

class Horario(var id: Int, var idDia: Int) {
    var inicio: String = ""
    var fin: String = ""


    constructor(id: Int, idDia: Int, inicio: String, fin: String) : this(id, idDia) {
        this.inicio = inicio
        this.fin = fin
    }
}