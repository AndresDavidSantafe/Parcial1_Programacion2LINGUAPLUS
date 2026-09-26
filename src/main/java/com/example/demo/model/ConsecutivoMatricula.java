package com.example.demo.model;


import java.util.concurrent.atomic.AtomicInteger;

public class ConsecutivoMatricula {
        private final AtomicInteger ultimo = new AtomicInteger(0);

        private ConsecutivoMatricula() { }

        private static class Holder {
            private static final ConsecutivoMatricula INSTANCIA = new ConsecutivoMatricula();
        }

        public static ConsecutivoMatricula getInstancia() {
            return Holder.INSTANCIA;
        }

        public int siguiente() {
            return ultimo.incrementAndGet();
        }
}
