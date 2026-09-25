package com.example.demo.model;

public abstract class ProgramaFormacion {

    private final int codigo;
    private final String nombre;
    private final String idioma;
    private final String descripcion;
    private final int duracionMeses;
    private final double valorMensual;
    private final Estado estado;

    private ProgramaFormacion(Builder b) {
        this.codigo = b.codigo;
        this.nombre = b.nombre;
        this.idioma = b.idioma;
        this.descripcion = b.descripcion;
        this.duracionMeses = b.duracionMeses;
        this.valorMensual = b.valorMensual;
        this.estado = b.estado;
    }

    public static class Builder{
        private int codigo;
        private String nombre;
        private String idioma;
        private String descripcion;
        private int duracionMeses;
        private double valorMensual;
        private Estado estado;

        public Builder conCodigo(int c){
            this.codigo=c;
            return this;
        }
        public Builder conNombre(String n){
            this.nombre=n;
            return this;
        }
        public Builder conIdioma(String i){
            this.idioma=i;
            return this;
        }
        public Builder conDescripcion(String d){
            this.descripcion=d;
            return this;
        }
        public Builder conDuracion(int r){
            this.duracionMeses=r;
            return this;
        }
        public Builder conValorMensual(double v){
            this.valorMensual=v;
            return this;
        }

        public Builder conEstado(Estado e){
            this.estado=e;
            return this;
        }

        public ProgramaFormacion build(){
            if(codigo<0){
                throw new IllegalStateException("el codigo es incorrecto");
            }
            if(nombre.isEmpty()){
                throw new IllegalStateException("falta nomrbe del programa");
            }
            if(idioma.isEmpty()){
                throw new IllegalStateException("falta idioma del programa");
            }
            if(descripcion.isEmpty()){
                throw new IllegalStateException("falta descripcion del programa");
            }
            if(duracionMeses<0){
                throw new IllegalStateException("falta descripcion del programa");
            }
            if(valorMensual<0){
                throw new IllegalStateException("falta descripcion del programa");
            }
            if(estado==null){
                throw new IllegalStateException("falta descripcion del programa");
            }
            return new ProgramaFormacion(this) {
            };
        }
    }
}
