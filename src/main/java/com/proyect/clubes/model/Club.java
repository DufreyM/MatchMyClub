package com.proyect.clubes.model;

import java.util.List;

public class Club {
    private String nombre;
    private String categoria;

    private List<String> horario;

    private String afluencia;

    private String accion;

    public Club(String nombre, String categoria, List<String> horario, String accion, String afluencia) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.horario = horario;
        this.accion = accion;
        this.afluencia = afluencia;
    }
}
