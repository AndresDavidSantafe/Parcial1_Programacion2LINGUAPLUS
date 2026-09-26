package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;


    public class ProgramaFormacion {

        private final int codigo;
        private final String nombre;
        private final String idioma;
        private final String descripcion;
        private final int duracionMeses;
        private final double valorMensual;
        private final Estado estado;
        private final TipoPrograma tipoPrograma;

        private final boolean plataforma;
        private final boolean club;
        private final boolean tutor;

        private final List<Estudiante> estudiantes;

        // Nuevos atributos provenientes del Abstract Factory
        private final Material material;
        private final Carnet carnet;

        private ProgramaFormacion(Builder b) {
            this.codigo = b.codigo;
            this.nombre = b.nombre;
            this.idioma = b.idioma;
            this.descripcion = b.descripcion;
            this.duracionMeses = b.duracionMeses;
            this.valorMensual = b.valorMensual;
            this.estado = b.estado;
            this.tipoPrograma = b.tipoPrograma;
            this.plataforma = b.plataforma;
            this.club = b.club;
            this.tutor = b.tutor;
            this.estudiantes = b.estudiantes;

            this.material = b.material;
            this.carnet = b.carnet;
        }

        public static class Builder {
            private int codigo;
            private String nombre;
            private String idioma;
            private String descripcion;
            private int duracionMeses;
            private double valorMensual;
            private Estado estado;
            private TipoPrograma tipoPrograma;

            private boolean plataforma = false;
            private boolean club = false;
            private boolean tutor = false;

            private List<Estudiante> estudiantes = new ArrayList<>();

            // Campos para la integración del Abstract Factory
            private Material material;
            private Carnet carnet;

            public Builder conCodigo(int c) {
                this.codigo = c;
                return this;
            }
            public Builder conNombre(String n) {
                this.nombre = n;
                return this;
            }
            public Builder conIdioma(String i) {
                this.idioma = i;
                return this;
            }
            public Builder conDescripcion(String d) {
                this.descripcion = d;
                return this;
            }
            public Builder conDuracion(int r) {
                this.duracionMeses = r;
                return this;
            }
            public Builder conValorMensual(double v) {
                this.valorMensual = v;
                return this;
            }
            public Builder conEstado(Estado e) {
                this.estado = e;
                return this;
            }
            public Builder conTipoPrograma(TipoPrograma tp) {
                this.tipoPrograma = tp;
                return this;
            }
            public Builder conPlataforma(boolean plataforma) {
                this.plataforma = plataforma;
                return this;
            }
            public Builder conClub(boolean club) {
                this.club = club;
                return this;
            }
            public Builder conTutor(boolean tutor) {
                this.tutor = tutor;
                return this;
            }
            public Builder conEstudiante(Estudiante estudiante) {
                this.estudiantes.add(estudiante);
                return this;
            }
            public Builder conEstudiantes(List<Estudiante> estudiantes) {
                this.estudiantes = estudiantes;
                return this;
            }

            public Builder conFabricaModalidad(AbstractFactory fabrica) {
                this.material = fabrica.crearMaterial();
                this.carnet = fabrica.crearCarnet();
                return this;
            }

            public ProgramaFormacion build() {
                if (codigo < 0) {
                    throw new IllegalStateException("El código es incorrecto");
                }
                if (nombre == null || nombre.isEmpty()) {
                    throw new IllegalStateException("Falta nombre del programa");
                }
                if (idioma == null || idioma.isEmpty()) {
                    throw new IllegalStateException("Falta idioma del programa");
                }
                if (descripcion == null || descripcion.isEmpty()) {
                    throw new IllegalStateException("Falta descripción del programa");
                }
                if (duracionMeses < 0) {
                    throw new IllegalStateException("Duración incorrecta");
                }
                if (valorMensual < 0) {
                    throw new IllegalStateException("Valor mensual incorrecto");
                }
                if (estado == null) {
                    throw new IllegalStateException("Falta estado del programa");
                }
                if (tipoPrograma == null) {
                    throw new IllegalStateException("Falta el tipo de programa");
                }
                // Validación para asegurar que se usó la fábrica y se asignaron los productos
                if (material == null || carnet == null) {
                    throw new IllegalStateException("Falta definir la fábrica de modalidad para los materiales y carnéts");
                }

                return new ProgramaFormacion(this);
            }
        }

        public int getCodigo() { return codigo; }
        public String getNombre() { return nombre; }
        public String getIdioma() { return idioma; }
        public String getDescripcion() { return descripcion; }
        public int getDuracionMeses() { return duracionMeses; }
        public double getValorMensual() { return valorMensual; }
        public Estado getEstado() { return estado; }
        public TipoPrograma getTipoPrograma() { return tipoPrograma; }
        public boolean isPlataforma() { return plataforma; }
        public boolean isClub() { return club; }
        public boolean isTutor() { return tutor; }
        public List<Estudiante> getEstudiantes() { return estudiantes; }

        // Getters para los productos de la fábrica
        public Material getMaterial() { return material; }
        public Carnet getCarnet() { return carnet; }

    }
