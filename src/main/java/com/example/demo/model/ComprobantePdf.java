package com.example.demo.model;

public class ComprobantePdf implements IComprobantePago {
    @Override
    public void generar() {
        System.out.println("Generando comprobante en formato PDF.");
    }
}
