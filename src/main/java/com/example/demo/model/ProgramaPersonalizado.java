package com.example.demo.model;

public class ProgramaPersonalizado extends ProgramaFormacion {

    private int sesionTutor;
    private String idiomaRequerido;
    private String objetivos;

    ProgramaPersonalizado(int codigo, String nombre, String idioma, String descripcion,
                          int duracionMeses, double valorMensual, Estado estado, TipoPrograma tipoPrograma,
                          int sesionTutor, String idiomaRequerido, String objetivos ) {
        super(codigo, nombre, idioma, descripcion, duracionMeses, valorMensual, estado, tipoPrograma);
        this.sesionTutor = sesionTutor;
        this.idiomaRequerido = idiomaRequerido;
        this.objetivos = objetivos;

    }

    public ProgramaPersonalizado(int sesionTutor, String idiomaRequerido, String objetivos) {
        super(codigo, idioma, descripcion, duracionMeses,valorMensual, estado);
        this.sesionTutor = sesionTutor;
        this.idiomaRequerido = idiomaRequerido;
        this.objetivos = objetivos;
    }
}
