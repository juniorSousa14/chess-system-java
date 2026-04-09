package org.example.prova02;

public abstract class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    abstract String categoria();

    public String exibirInfo() {
        return String.format("Produto: %s | Preço: R$ %.2f", nome, preco);
    }
}
