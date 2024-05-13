package com.proyect.clubes.service;

import com.proyect.clubes.model.Usuario;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public boolean autenticarUsuario(Usuario usuario) {
        // Lógica de autenticación aquí
        // Por ejemplo, puedes verificar las credenciales contra una base de datos
        return "usuario".equals(usuario.getNombreUsuario()) && "contraseña".equals(usuario.getContraseña());
    }
}
