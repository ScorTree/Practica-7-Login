package mx.ipn.upiicsa.programacionmovil.citas.entity

class DiaDescanso(var id: Int, var idEmpleado: Int) {
    var descanso: Long = 0


    constructor(id: Int, idEmpleado: Int, descanso: Long) : this(id, idEmpleado) {
        this.descanso = descanso
    }
}