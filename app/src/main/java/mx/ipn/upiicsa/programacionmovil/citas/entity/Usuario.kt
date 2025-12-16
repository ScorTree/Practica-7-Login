package mx.ipn.upiicsa.programacionmovil.citas.entity

class Usuario(var id: Int, var idPersona: Int) {
    var login: String = ""
    var password: String = ""
    var activo: Boolean = false


    constructor(id: Int, idPersona: Int, login: String, password: String, activo: Boolean) : this(id, idPersona) {
        this.login = login
        this.password = password
        this.activo = activo
    }
}