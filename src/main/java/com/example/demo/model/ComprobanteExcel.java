package com.example.demo.model;

public class ComprobanteExcel implements IComprobantePago{
    @Override
    public void generar() {
        System.out.println("Generando comprobante en formato XML.");
    }
}
