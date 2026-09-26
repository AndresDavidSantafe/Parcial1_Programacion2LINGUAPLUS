package com.example.demo.model;

public class FabricaPdf extends FabricaFormato {
        @Override
        public ComprobanteExcel crearComprobante() {
            return new ComprobanteExcel();
        }
}
