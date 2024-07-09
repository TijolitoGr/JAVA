package com.example.rest.service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class RaizController {

    private final AtomicLong idCounter = new AtomicLong();

    @GetMapping("/raiz")
    public RaizResponse calcularRaiz(@RequestParam(value = "num", defaultValue = "0") double numero) {
        double resultado = Math.sqrt(numero);
        long id = idCounter.incrementAndGet();
        return new RaizResponse(id, resultado);
    }

    // Classe interna para representar a resposta JSON
    private static class RaizResponse {
        private final long id;
        private final double resultado;

        public RaizResponse(long id, double resultado) {
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