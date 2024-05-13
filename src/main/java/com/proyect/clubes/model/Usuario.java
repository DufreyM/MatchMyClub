package com.proyect.clubes.model;
public class Usuario {
    private Long id;
    private String nombreUsuario;
    private String contraseña;

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    // Otros atributos y métodos getter/setter
}
