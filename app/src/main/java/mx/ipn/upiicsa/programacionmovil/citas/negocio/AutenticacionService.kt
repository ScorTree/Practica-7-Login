package mx.ipn.upiicsa.programacionmovil.citas.negocio

import mx.ipn.upiicsa.programacionmovil.citas.data.dao.UsuarioDao
import java.security.MessageDigest
import android.util.Base64

class AutenticacionService {

    private val usuarioDao = UsuarioDao()

    fun autenticar(login: String, password: String): Boolean {

        if (!usuarioDao.existeUsuario(login)) {
            return false
        }

        val passwordPlano = usuarioDao.obtenerPassword(login) ?: return false

        val hashEntrada = hashPassword(password)
        val hashGuardado = hashPassword(passwordPlano)

        return hashEntrada == hashGuardado
    }

    private fun hashPassword(password: String): String {
        val digest = MessageDigest.getInstance("SHA-512")
        val hashBytes = digest.digest(password.toByteArray(Charsets.UTF_8))
        return Base64.encodeToString(hashBytes, Base64.NO_WRAP)
    }
}
