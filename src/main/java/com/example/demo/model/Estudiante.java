package com.example.demo.model;

import java.time.LocalDate;

public class Estudiante {

    private String nombreCompleto;
    private int documento;
    private int telefono;
    private String correo;
    private int edad;
    private String fechaRegistro;

    Estudiante(String nombreCompleto, int documento, int telefono, String correo, int edad, String fechaRegistro) {
        this.nombreCompleto = nombreCompleto;
        this.documento = documento;
        this.telefono = telefono;
        this.correo = correo;
        this.edad = edad;
        this.fechaRegistro = fechaRegistro;
    }

    public String nombreCompleto() {
        return nombreCompleto;
    }

    public int documento() {
        return documento;
    }

    public int telefono() {
        return telefono;
    }

    public String correo() {
        return correo;
    }

    public int edad() {
        return edad;
    }

    public String fechaRegistro() {
        return fechaRegistro;
    }
}
