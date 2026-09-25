package com.example.demo.model;

public class ProgramaFormacion {

    private int codigo;
    private String nombre;
    private String idioma;
    private String descripcion;
    private int duracionMeses;
    private double valorMensual;
    private Estado estado;
    private TipoPrograma tipoPrograma;

    ProgramaFormacion(int codigo, String nombre, String idioma, String descripcion,
                      int duracionMeses, double valorMensual, Estado estado, TipoPrograma tipoPrograma) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.idioma = idioma;
        this.descripcion = descripcion;
        this.duracionMeses = duracionMeses;
        this.valorMensual = valorMensual;
        this.estado = estado;
        this.tipoPrograma = tipoPrograma;
    }

}
