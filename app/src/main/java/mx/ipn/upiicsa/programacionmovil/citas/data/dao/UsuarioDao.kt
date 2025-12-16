package mx.ipn.upiicsa.programacionmovil.citas.data.dao

class UsuarioDao {

    private val usuarios = mapOf(
        "admin" to "admin123",
        "root" to "r0ot.",
        "administrator" to "prueba123"
    )

    fun existeUsuario(login: String): Boolean {
        return usuarios.containsKey(login)
    }

    fun obtenerPassword(login: String): String? {
        return usuarios[login]
    }
}
