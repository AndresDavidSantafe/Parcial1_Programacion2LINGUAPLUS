package com.example.demo.model;

import javafx.scene.control.ListView;

import java.time.LocalDate;
import java.util.List;

public class Matricula {
    private int numeroMatricula;
    private Estudiante estudiante;
    private ProgramaFormacion programa;
    private LocalDate fechaInicio;

    // Atributos opcionales sin final
    private String docenteTutor;
    private List<String> serviciosAdicionales;
    private double descuento;
    private String observaciones;

    public Matricula(Estudiante estudiante, ProgramaFormacion programa, LocalDate fechaInicio,
                     String docenteTutor, List<String> serviciosAdicionales, double descuento, String observaciones) {

        if (programa == null) {
            throw new IllegalArgumentException("No puede existir una matrícula sin programa.");
        }

        double valorPrograma = programa.getValorMensual() * programa.getDuracionMeses();
        if (descuento > (valorPrograma * 0.30)) {
            throw new IllegalArgumentException("El descuento no puede superar el 30% del valor del programa.");
        }

        this.numeroMatricula = ConsecutivoMatricula.getInstancia().siguiente();
        this.estudiante = estudiante;
        this.programa = programa;
        this.fechaInicio = fechaInicio;
        this.docenteTutor = docenteTutor;
        this.serviciosAdicionales = serviciosAdicionales;
        this.descuento = descuento;
        this.observaciones = observaciones;
    }

    // Getters y Setters
    public int getNumeroMatricula() { return numeroMatricula; }
    public void setNumeroMatricula(int numeroMatricula) { this.numeroMatricula = numeroMatricula; }

    public Estudiante getEstudiante() { return estudiante; }
    public void setEstudiante(Estudiante estudiante) { this.estudiante = estudiante; }

    public ProgramaFormacion getPrograma() { return programa; }
    public void setPrograma(ProgramaFormacion programa) { this.programa = programa; }

    public LocalDate getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(LocalDate fechaInicio) { this.fechaInicio = fechaInicio; }

    public String getDocenteTutor() { return docenteTutor; }
    public void setDocenteTutor(String docenteTutor) { this.docenteTutor = docenteTutor; }

    public List<String> getServiciosAdicionales() { return serviciosAdicionales; }
    public void setServiciosAdicionales(List<String> serviciosAdicionales) { this.serviciosAdicionales = serviciosAdicionales; }

    public double getDescuento() { return descuento; }
    public void setDescuento(double descuento) { this.descuento = descuento; }

    public String getObservaciones() { return observaciones; }
    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }
}
