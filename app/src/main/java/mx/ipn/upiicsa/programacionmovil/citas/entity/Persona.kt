package mx.ipn.upiicsa.programacionmovil.citas.entity

import java.time.LocalDate

class Persona(
    var id: Int,
    var apellidoP: String,
    var nombre: String,
    var apellidoM: String,
    var nacimiento: LocalDate
) {

    var idGenero: Int = 0

    constructor(
        id: Int,
        apellidoP: String,
        nombre: String,
        apellidoM: String,
        nacimiento: LocalDate,
        idGenero: Int
    ) : this(id, apellidoP, nombre, apellidoM, nacimiento) {
        this.idGenero = idGenero
    }
}
