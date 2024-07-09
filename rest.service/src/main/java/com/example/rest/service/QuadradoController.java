package com.example.rest.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class QuadradoController {

    private final AtomicLong idCounter = new AtomicLong();

    @GetMapping("/quadrado")
    public QuadradoResponse calcularQuadrado(@RequestParam(value = "num", defaultValue = "0") double numero) {
        double resultado = numero * numero;
        long id = idCounter.incrementAndGet();
        return new QuadradoResponse(id, resultado);
    }

    // Classe interna para representar a resposta JSON
    private static class QuadradoResponse {
        private final long id;
        private final double resultado;

        public QuadradoResponse(long id, double resultado) {
            this.id = id;
            this.resultado = resultado;
        }

        public long getId() {
            return id;
        }

        public double getResultado() {
            return resultado;
        }
    }
}