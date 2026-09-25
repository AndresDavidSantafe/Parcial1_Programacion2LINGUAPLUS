package com.example.demo.model;

public class ProgramaIntensivo extends ProgramaFormacion{
    ProgramaIntensivo(int codigo, String nombre, String idioma, String descripcion, int duracionMeses, double valorMensual, Estado estado, TipoPrograma tipoPrograma) {
        super(codigo, nombre, idioma, descripcion, duracionMeses, valorMensual, estado, tipoPrograma);
    }
}
