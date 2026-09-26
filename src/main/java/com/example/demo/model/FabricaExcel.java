package com.example.demo.model;

public class FabricaExcel extends FabricaFormato{
    @Override
    public ComprobantePdf crearComprobante() {
        return new ComprobantePdf();
    }
}
