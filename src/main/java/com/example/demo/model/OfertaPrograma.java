package com.example.demo.model;

public class OfertaPrograma {
    private final ProgramaFormacion programa;
    private int cuposDisponibles;

    public OfertaPrograma(ProgramaFormacion programa, int cuposDisponibles) {
        if(cuposDisponibles < 0) {
            throw new IllegalArgumentException("No se pueden tener cupos negativos!");
        }
        this.programa = programa;
        this.cuposDisponibles = 0;
    }

}
