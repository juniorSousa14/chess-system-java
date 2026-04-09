package org.example.prova02;

public interface Tributavel {

    double calcularImposto();

    default String descricaoImposto() {
        return "Imposto calculado com sucesso";
    }
}
